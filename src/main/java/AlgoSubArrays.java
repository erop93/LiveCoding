public class AlgoSubArrays {
    // Дан массив, содержащий 1 и 0. Найти длину самой большой неприрывной последовательности 1.
    // Пример int[]{1,1,0,1,1,1,0} = 3
    public static void main(String[] args) {
        System.out.println(biggestOne(new int[]{1, 1, 0, 1, 1, 1, 0}));
    }

    public static int biggestOne(int[] arr) {
        int countMax = 0; // Счетчик для максимальной длины подмассива единиц
        int countCurrent = 0; // Счетчик для текущей длины подмассива единиц

        // Цикл по массиву
        for (int j : arr) {
            // Если число равно 1 - увеличиваем текущий счетчик на 1
            if (j == 1) {
                countCurrent++;
                // В противном случае обнуляем этот счетчик
            } else {
                countCurrent = 0;
            }
            // Если текущий счетчик больше максимального - присваиваем текущий максимальному
            if (countCurrent > countMax) {
                countMax = countCurrent;
            }
        }
        return countMax;
    }
}
