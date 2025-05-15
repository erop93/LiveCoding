public class AlgoChristmasTreeHalf {
    public static void main(String[] args) {
        int[] levels = {5, 5, 5}; // высоты каждого уровня
        int maxWidth = 9; // максимально возможная ширина (для выравнивания по правому краю)

        StringBuilder halfTree = new StringBuilder();

        for (int level : levels) {
            buildHalfTree(level, maxWidth, halfTree);
        }
        System.out.println(halfTree);
    }

    public static void buildHalfTree(int height, int maxWidth, StringBuilder halfTree) {
        for (int i = 1; i <= height ; i++) {
            // Добавляем пробелы слева, чтобы выровнять по правому краю
            halfTree.append(" ".repeat(maxWidth - i));
            // Рисуем i звёздочек
            halfTree.append("*".repeat(i));
            // Перенос строки
            halfTree.append("\n");
        }
    }
}
