public class AlgoDrawCircle {
    public static void main(String[] args) {
        System.out.println(printCircle(5));
        System.out.println(printCircle(10));
        System.out.println(printCircle(4));
        System.out.println(printCircle(16));
    }

    public static String printCircle(int radius) {
        StringBuilder circle = new StringBuilder();
        int diameter = radius * 2;

        // Внешний цикл по строкам
        for (int y = 0; y <= diameter; y++) {
            // Вложенный цикл по символам в строке
            for (int x = 0; x <= diameter; x++) {
                // Чтобы понять, находится ли точка (x, y) на окружности,
                // нужно измерить расстояние от центра круга (radius, radius)
                // dx и dy — это смещение точки от центра по горизонтали и вертикали:
                // dx = x - radius — расстояние по оси X от центра
                // dy = y - radius — расстояние по оси Y от центра
                int dx = x - radius;
                int dy = y - radius;

                // Формула круга - x² + y² ≤ r².
                // Если точка (dx, dy) лежит внутри или на границе окружности радиуса r,
                // то условие выполнено — ставим "*". Иначе " ".
                if (dx * dx + dy * dy <= radius * radius) {
                    circle.append("*");
                } else {
                    circle.append(" ");
                }
            }
            // После каждой строки круга — переход на новую строку.
            circle.append("\n");
        }
        return circle.toString();
    }
}
