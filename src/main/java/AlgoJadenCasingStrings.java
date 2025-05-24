import java.util.ArrayList;
import java.util.List;

public class AlgoJadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    // Turn
    // Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
    // Into
    // Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

    public static String toJadenCase(String phrase) {
        // Если строка равно null или пустая, возвращаем null
        if (phrase == null || phrase.isEmpty()) return null;

        // StringBuilder для сбора новой строки из массива слов
        StringBuilder sb = new StringBuilder();

        // Делим изначальную строку на массив слов через пробел
        String[] words = phrase.split(" ");
        for (String word : words) {
            // Новая строка: Подстрока из 1-го символа в верхнем регистре + подстрока из оставшихся символов
            String newWord = word.substring(0,1).toUpperCase() + word.substring(1);
            // Добавляем каждое слово и пробел в StringBuilder
            sb.append(newWord).append(" ");
        }
        // Возвращаем подстроку, где все символы, кроме последнего пробела
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

}
