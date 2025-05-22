import java.util.ArrayList;
import java.util.List;

public class AlgoMumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }

    public static String accum(String s) {
        // Создаем список частей финальной строки
        List<String> parts = new ArrayList<>();
        // Проходим по символам строки
        for (int i = 0; i < s.length(); i++) {
            // Берем отдельные символы
           char c = s.charAt(i);
           // Создаем части строки по каждой букве:
            // Первая буква заглавная + последующие строчные * на порядковый номер символа
           String part = Character.toUpperCase(c) + String.valueOf(Character.toLowerCase(c)).repeat(i);
           // Добавляем строку в лист
            parts.add(part);
        }
        // Соединяем строки через символ "-"
        return String.join("-", parts);
    }
}

//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
