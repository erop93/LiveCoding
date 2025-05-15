import java.util.HashMap;

public class AlgoProjectingStrings {
    public static void main(String[] args) {
        System.out.println(validString("egg", "add")); // true
        System.out.println(validString("foo", "bar")); // false
        System.out.println(validString("paper", "title")); // true
    }
//    Дано 2 строки. Необходимо проверить, проецируются ли буквы первой строки на буквы второй строки.
//    Пример 1: 51 = "egg", s2 = "add", ответ = true
//    Пример 2: 51 = "foo", s2 = "bar", ответ = false
//    Пример 3: s1 = "paper", s2 = "title" , ответ = true

    public static boolean validString(String str1, String str2) {
        if (str1.length() != str2.length()) return false; // Если длины строк разные, сразу возвращаем false

        // Создаем две карты для отображения сопоставлений:
        // map1 — символы первой строки на символы второй,
        // map2 — символы второй строки на символы первой (для проверки обратного соответствия)
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        // Проходим по всем символам строк
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i); // Берем символ из первой строки
            char c2 = str2.charAt(i); // Берем соответствующий символ из второй строки

            // Проверяем: если символ c1 уже сопоставлен с другим символом
            if (map1.containsKey(c1)) {
                // Если сопоставленный символ отличается от текущего c2 — строки несовместимы
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                // Если c1 ещё не сопоставлен, добавляем его сопоставление
                map1.put(c1, c2);
            }

            // Теперь аналогичная проверка для второй строки
            if (map2.containsKey(c2)) {
                // Если сопоставленный символ отличается от c1 — строки несовместимы
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                // Если c2 ещё не сопоставлен, добавляем его сопоставление
                map2.put(c2, c1);
            }
        }
        // Если прошли весь цикл без конфликтов — строки можно сопоставить
        return true;
    }
}
