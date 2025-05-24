public class AlgoXandO {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }

    // Check to see if a string has the same amount of 'x's and 'o's.
    // The method must return a boolean and be case insensitive.
    // The string can contain any char.

    public static boolean getXO (String str) {
        // Приводим строку к нижнему регистру
        str = str.toLowerCase();

        // Счетчики для букв Х и О
        int counterX = 0;
        int counterO = 0;

        // Увеличиваем счетчик, если встречается буква Х или О
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                counterX++;
            } else if (str.charAt(i) == 'o') {
                counterO++;
            }
        }
        // Если счетчики равны, возвращаем true
        return counterX == counterO;
    }
}
