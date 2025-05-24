import java.util.HashSet;
import java.util.Set;

public class AlgoIsograms {
//    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
//    Implement a function that determines whether a string that contains only letters is an isogram.
//    Assume the empty string is an isogram. Ignore letter case.

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        // Set для хранения уже встреченных букв
        Set<Character> letters = new HashSet<>();
        // Строку к нижнему регистру
        str = str.toLowerCase();

        for (Character ch : str.toCharArray()) {
            // Если буква уже есть в Сете, возвращаем false
            if (letters.contains(ch)) {
                return false;
            } else {
                // Иначе добавляем букву в Сет
                letters.add(ch);
            }
        }
        return true;
    }
}
