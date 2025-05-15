public class AlgoNumberParts {
    public static void main(String[] args) {
        System.out.println(convert(12)) ;
        System.out.println(convert(45));
        System.out. println(convert(70304));
    }

    public static String convert(int number) {
        StringBuilder result = new StringBuilder();
        // Преобразуем число в строку для удобства посимвольного перебора
        String strNum = String.valueOf(number);

        for (int i = 0; i < strNum.length(); i++) {
            // Если мы на последней цифре (единицы) — просто добавляем её и выходим
            if (i == strNum.length() - 1) {
                result.append(strNum.charAt(i));
                break;
            }
            // Если текущая цифра равна '0', пропускаем её (нет смысла добавлять нули)
            if(strNum.charAt(i) == '0') {
                continue;
            }
            // Иначе:
            // Добавляем текущую цифру + необходимое количество нулей (длина строки - индекс - 1)
            result.append(strNum.charAt(i))
                    .append("0".repeat(strNum.length() - i - 1))
                    .append(" + ");
        }
        return result.toString();
    }
}
// Сделать из переданного числа строку, разбитую на десятки, сотни и т.д.
// В формате 70304 = 70000 + 300 + 4
