public class AlgoRepeatedHi {
    public static void main(String[] args) {
        String str = "xxhixxxxhihi";
        System.out.println(repeatedWords(str));
    }

    public static int repeatedWords(String str) {
        String result = "hi";
        int counter = 0;

        // Итерируемся по строке минус длина искомого слова, чтобы не выйти за предел массива
        for (int i = 0; i <= str.length() - result.length(); i++) {
            // Берем подстроку от i-го элемента до i + длина подстроки и смотрим, содержит ли она искомую строку
            if (str.substring(i, i + result.length()).contains(result)) {
                // Если да - инкрементим счетчик
                counter++;
            }
        }
        return counter;
    }
}
// Дана строка в нижнем регистре с встречающейся несколько раз последовательностью "hi"
// Найти общее число таких последовательностей в строке.