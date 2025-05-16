public class AlgoStringIsNumber {
    // Если вводимая строка является строкой - бросить исключение. Если числом - вывести его.
    public static void main(String[] args) {
        System.out.println(isNumber("100"));
        System.out.println(isNumber("-500"));
        System.out.println(isNumber("Hello"));
    }

    public static int isNumber(String string) {
        // Оборачиваем числовой резульат в try
        try {
            int result = Integer.parseInt(string);
            return result;
            // Обрабатываем случай, когда не удается строку распарсить в число
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Строка не является числом: " + string);
        }
    }
}
