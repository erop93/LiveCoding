import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algo1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 0};
        int[] array2 = {5, 1, 2, 7, 3, 2, 2};
        System.out.println(getRepeatedIntersection(array1, array2));
    }

//    найти пересечения всех чисел в массивах
//    input: [1, 2, 3, 2, 0], [5, 1, 2, 7, 3, 2, 2]
//    output: [1,2,2,3]
    public static List<Integer> getRepeatedIntersection (int[] array1, int[] array2) {
        Map<Integer, Integer> repeated = new HashMap<>(); // Map для подсчета количества вхождений чисел из array1
        List<Integer> result = new ArrayList<>(); // Список результата пересечения

        // Заполняем Map: сколько раз каждое число встречается в array1
        for (int number : array1) {
            repeated.put(number, repeated.getOrDefault(number, 0) + 1);
            // если числа нет — берем 0, иначе текущее значение, и прибавляем 1
        }

        // Проверяем числа из array2
        for (int number : array2) {
            if (repeated.containsKey(number) && repeated.get(number) > 0) {
                result.add(number); // если число есть в map и ещё "не израсходовано" — добавляем в результат
                repeated.put(number, repeated.get(number) - 1); // уменьшаем счётчик этого числа на 1
            }
        }
        return result;
    }
}
