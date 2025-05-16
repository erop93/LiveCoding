import java.util.HashMap;
import java.util.Map;

public class AlgoSubArrayMaxSequence {
    // Дан массив целых чисел, найти максимальную длину подмассива, в котором каждый элемент повторяется не более 2 раз
    // Пример int[] {1,2,1,1,1,2,1,3} = 4
    public static void main(String[] args) {
        System.out.println(maxSequence(new int[]{1, 2, 1, 1, 1, 2, 1, 3}));
    }

    public static int maxSequence(int[] arr) {
        // Хэш таблица для подсчета количества каждого элемента в текущем подмассиве
        Map<Integer, Integer> countMap = new HashMap<>();

        int left = 0; // Левая граница "скользящего окна"
        int maxLength = 0; // Переменная для хранения максимальной длины подходящего подмассива

        // Проходим по массиву правой границей окна
        for (int right = 0; right < arr.length; right++) {
            // Текущее число, на которое указывает правая граница
            int num = arr[right];
            // Увеличиваем счётчик текущего числа в countMap
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // Если число встречается более 2 раз, сдвигаем левую границу окна
            while (countMap.get(num) > 2) {
                // Число на левой границе
                int leftNum = arr[left];
                // Уменьшаем счётчик этого числа
                countMap.put(leftNum, countMap.get(leftNum) -1);
                // Двигаем левую границу вправо
                left++;
            }
            // Обновляем максимальную длину подмассива
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
