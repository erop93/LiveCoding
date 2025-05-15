public class AlgoRemoveDuplicates {
    public static void main(String[] args) {
    }

    public static String removeDuplicates (String s) {
        // Используем StringBuilder как стек
        StringBuilder sb = new StringBuilder();

        for (char letter : s.toCharArray()) {
            // Если стек не пуст и последний символ совпадает с текущим, удаляем его
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == letter) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                // Иначе добавляем текущий символ в стек
                sb.append(letter);
            }
        }
        // Преобразуем стек обратно в строку
        return sb.toString();
    }
}

/*
Напишите метод, который удаляет все смежные одинаковые символы в строке.
Если после удаления снова появляются смежные одинаковые символы, они также должны быть удалены.
Повторяйте процесс, пока не останется никаких смежных одинаковых символов.
Пример входных данных:
"abbaca"
"azxxzy."
Пример выходных данных:
"ca"
"ay"
*/