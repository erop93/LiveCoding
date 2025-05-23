import java.util.Arrays;

public class AlgoMaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int sum = 0; // переменная для хранения суммы текущего подмассива
        int maxSum = Integer.MIN_VALUE; // максимум суммы подмассива
        int index = 0; // индекс начала подмассива, у которого максимальная сумма

        // проходим по массиву так, чтобы не выйти за границы, начиная с каждого возможного подмассива длины k
        for (int i = 0; i < nums.length + 1 - k; i++) { // Будут 0-3, 1-4, 2-5
            sum = 0; // сбрасываем сумму перед новым подсчётом
            for (int j = i; j < k + i; j++) {
                sum = sum + nums[i]; // суммируем k подряд идущих чисел начиная с i
            }
            if (sum > maxSum) {
                maxSum = sum; // обновляем максимальную сумму, если текущая больше
                index = i; // запоминаем индекс начала подмассива
            }
        }
        System.out.println(maxSum);
        // копируем подмассив с максимальной суммой (от index до index + k)
        int[] ints = Arrays.copyOfRange(nums, index, index + k);
        System.out.println(Arrays.toString(ints)); // выводим этот подмассив
    }
}

// Дан массив и длинна подмассива. Необходимо найти подмассив, среднее значение элементов которого будет максимальным.
// В данном случае подмассив с максимальным среднем значением является {12, -5, -6, 50}
// (12 - 5 - 6 + 50) / 4 = 12.75

// Посчитать сумму для 1 подмассива, а для второго прибавить еще 1 элемент и вычесть первый.