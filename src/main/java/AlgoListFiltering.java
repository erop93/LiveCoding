import java.util.ArrayList;
import java.util.List;

public class AlgoListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)));
    }

    public static List<Object> filterList(final List<Object> list) {
        // Создаем лист, в котором будут храниться числа
        List<Object> result = new ArrayList<>();
        // Цикл по переданному листу
        for (Object obj : list) {
            // Если элемент является типом Integer - добавляем в финальный лист
            if (obj instanceof Integer) {
                result.add(obj);
            }
        }
        return result;
    }
}

//  Create a function that takes a list of non-negative integers and strings
//  and returns a new list with the strings filtered out.