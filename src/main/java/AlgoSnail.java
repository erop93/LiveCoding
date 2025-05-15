public class AlgoSnail {
    public static void main(String[] args) {
        System.out. println(snail(10, 3, 2));
        System.out.println(snail(20, 7, 3));
    }

    public static int snail(int column, int day, int night) {
        // Если расстояние, проходимое за день, больше высоты стены, сразу возвращаем 1 день
        if (day >= column) return 1;

        // Перемещение за сутки
        int metersPerDay = day - night;
        // Оставшееся расстояние
        int remainingHeight = column - metersPerDay;

        // Сколько полных дней получается - оставшуюся высоту разделить на перемещение за сутки
        // Высота стены = расстояние за сутки * количество дней
        // Количество дней = Высота стены (column) / расстояние за сутки (metersPerDay)
        int fullDays = (int) Math.ceil((double) remainingHeight / metersPerDay);

        // Добавляем еще 1 день, потому что в последний день улитка достигает вершины и НЕ сползает вниз
        return fullDays + 1;
    }
}

// Улитка ползет по стене, в день поднимается на n метров и за ночь сползает на m метров.
// За сколько полных дней она доберется до верха стены?
