public class AlgoSecondLargest {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,676,87};
        System.out.println(findSecondLargest(array));
    }

    public static Integer findSecondLargest(int[] array) {
        Integer max = Integer.MIN_VALUE;
        Integer secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) { // Если текущий элемент больше mах
                secondMax = max; // Текущий mах становится вторым по величине
                max = num; // Обновляем max
            } else if (num > secondMax && num != max) { // Если текущий элемент больше secondMax и не равен max
                secondMax = num; // Обновляем secondMax
            }
        }
        // Проверяем, найден ли второй по величине элемент
        if (secondMax == Integer.MIN_VALUE) {
            return null; // Если второго по величине элемента нет
        }
        return secondMax; // Возвращаем второй по величине элемент
    }
}
