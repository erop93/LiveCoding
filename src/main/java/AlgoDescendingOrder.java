import java.util.ArrayList;
import java.util.List;

public class AlgoDescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {
        // Преобразуем число в строку
        String s = String.valueOf(num);
        // Преобразуем строку в массив символов
        char[] digits = s.toCharArray();

        // Сортировка по убыванию (простая пузырьковая)
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - 1 - i; j++) {
                if (digits[j] < digits[j + 1]) {
                    char temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }
        // Обратно в строку и в int
        return Integer.parseInt(new String(digits));
    }
}

// Your task is to make a function that can take any non-negative integer as an argument
// and return it with its digits in descending order.
// Essentially, rearrange the digits to create the highest possible number.