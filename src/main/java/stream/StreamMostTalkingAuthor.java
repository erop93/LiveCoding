package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMostTalkingAuthor {
    public static void main(String[] args) {
        List<String> chat = List.of(
                "Andrew:something i can talk",
                "Ben:me too",
                "Andrew:more and more",
                "Sam:I can talk endlessly so I will speak more and more"
        );

        System.out.println(findTheMostTalkingAuthor(chat, 3));
    }

    /*
    К нам приходит List‹String>, где каждая строка, это строка из чата.
    Необходимо реализовать метод, который посчитает кто из пользователей произнес наибольшее количество слов
    'numToView' указывает, сколько пользователей мы хотим увидеть в конце в порядке их болтливости.
    */
    public static List<String> findTheMostTalkingAuthor(List<String> records, Integer numToView) {
        return records.stream()
                // Разбиваем каждую строку на 2 части через двоеточие (первое двоеточие)
                .map(s -> s.split(":", 2))
                // Группируем по имени автора
                .collect(Collectors.groupingBy(strings -> strings[0],
                        // Считаем общее количество слов в сообщениях каждого автора
                        Collectors.summingInt(strings -> strings[1].trim().split(" ").length)))
                // Превращаем Map<String, Integer> в поток Map.Entry<Автор, Кол-во слов>
                .entrySet().stream()
                // Сортируем авторов по убыванию количества слов
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                // Ограничиваем список до numToView авторов
                .limit(numToView)
                // Из Map.Entry<Автор, Кол-во слов> берём только имя автора
                .map(Map.Entry::getKey)
                // Собираем имена авторов в List<String>
                .collect(Collectors.toList());
    }
}