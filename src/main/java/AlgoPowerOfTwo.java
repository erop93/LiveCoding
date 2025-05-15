public class AlgoPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(1000000000 + " " + isPowerOfTwo(1000000000));
        System.out.println(0 + " " + isPowerOfTwo(0));
        System.out.println(1 + " " + isPowerOfTwo(1));
        System.out.println(2 + " " + isPowerOfTwo(2));
        System.out.println(3 + " " + isPowerOfTwo(3));
        System.out.println(7 + " " + isPowerOfTwo(7));
        System.out.println(16 + " " + isPowerOfTwo(16));
        System.out.println(15 + " " + isPowerOfTwo(15));
        System.out.println(10 + " " + isPowerOfTwo(10));
    }

    private static boolean isPowerOfTwo(int i) {
        if (i <= 0) { // Шаг 1: Проверяем, положительное ли число
            return false;
        }

        while (i % 2 == 0) { // Шаг 2: Пока число делится на 2 без остатка
            i /= 2; // Шаг 3: Делим число на 2
        }
        return i == 1; // Шаг 4: Если после всех делений остаётся 1, то это степень двойки
    }
}
//   Напиши метод, который вернет true, если переданное число является степенью двойки, и false если нет.