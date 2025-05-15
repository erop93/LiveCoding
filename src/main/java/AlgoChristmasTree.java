public class AlgoChristmasTree {
    public static void main(String[] args) {
        // Массив, где каждый элемент — это "высота" одного уровня ёлки (то есть сколько строк в одном треугольнике)
        int[] levels = {5, 5, 5};
        // Ширина самой нижней части ёлки — используется для выравнивания по центру
        int maxWidth = 9;

        StringBuilder tree = new StringBuilder();

        // Для каждого уровня в ёлке вызываем метод, который добавляет треугольник в общую строку
        for (int level : levels) {
            buildTreeParts(level, maxWidth, tree);
        }

        System.out.println(tree.toString());
    }

    // Метод строит один "уровень" ёлки (треугольник) и добавляет его к общему StringBuilder
    public static void buildTreeParts(int height, int maxWidth, StringBuilder tree) {
        // Вычисляем отступ слева для первой строки текущего треугольника
        // Например: если maxWidth = 9, height = 5 → текущая ширина треугольника = 9, и start будет = 0
        // (2 * height - 1) - количество * на последней строке уровня.
        int start = (maxWidth - (2 * height - 1)) / 2;

        // Строим строки от 1 до height (от верхушки до основания треугольника)
        for (int i = 1; i <= height; i++) {
            // Добавляем пробелы слева, чтобы выровнять строку по центру
            // Например: для первой строки нужно больше пробелов, чем для последней
            // height - i — сколько пробелов слева, чтобы центрировать строку
            // 2 * i - 1 — сколько * нарисовать
            tree.append(" ".repeat(start + (height - i)));
            // Добавляем звездочки: на каждой строке их количество равно (2 * i - 1)
            tree.append("*".repeat(i * 2 -1));
            // Переход на новую строку
            tree.append("\n");
        }
    }
}

// Вывести в консоли елку из треугольников
