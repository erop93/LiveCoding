import java.util.Arrays;

public class AlgoWordsWithNumbers {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out. println(order("40f Fo1r pe6ople g3ood th5e the2")) ;
    }

    private static String order(String words) {
        // Если строка пустая - возвращаем пустоту.
        if (words.isEmpty()) {
            return "";
        }
        // Разбиваем строку на массив строк
        String[] wordsArray = words.split(" ");
        // Сортируем массив wordsArray с использованием лямбда-выражения:
        // для каждого слова вызываем findNumber, чтобы извлечь встроенное число, сравниваем эти числа
        Arrays.sort(wordsArray, (String a, String b) -> findNumber(a) - findNumber(b));
        // Склеиваем отсортированные слова в одну строку, разделяя их пробелами.
        return String.join(" ", wordsArray);
    }

    // Метод, извлекающий первую цифру из слова
    private static int findNumber(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                // Способ из символа получит цифру
                return c - '0';
            }
        }
        return 0;
    }
}
/**
 * Необходимо отсортировать заданную строку.
 * Каждое слово в строке будет содержать одно число.
 * Это число обозначает позицию, которую слово должно занимать в результате.
 * <p>
 * Примечание. Числа могут быть от 1 до 9.
 * Таким образом, первым словом будет 1 (а не 0).
 * <p>
 * Если входная строка пуста, верните пустую строку.
 * <p>
 * Пример:
 * "is2 Thi1s T4est 3a" ---> "Thi1s is2 3a T4est"
 * *"4of Fo1r pe6ople g3ood th5e the2" --> "Fo1r the2 g3ood 4of th5e pe6ople"
 */
