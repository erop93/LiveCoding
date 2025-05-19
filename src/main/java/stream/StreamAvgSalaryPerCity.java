package stream;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAvgSalaryPerCity {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000.0, 18, "NY"),
                new Employee("Bob", "IT", 60000.0, 25, "LA"),
                new Employee("Charlie", "Finance", 55000.0, 34, "NY"),
                new Employee("David", "IT", 70000.0, 41, "LA"),
                new Employee("Eva", "HR", 45000.0, 19, "C"),
                new Employee("Frank", "Finance", 58000.0, 27, "C")
        );
        System.out.println(getAverageSalaryPerCity(employees));
    }

    /*
     * Посчитать среднюю зарплату по каждому городу
     */
    @Getter
    @Setter
    public static class Employee {
        private String name;
        private String department;
        private Double salary;
        private Integer age;
        private String city;

        public Employee(String name, String department, Double salary, Integer age, String city) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.age = age;
            this.city = city;
        }
    }

    public static Map<String, Double> getAverageSalaryPerCity(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.averagingDouble(Employee::getSalary)));
    }
}
