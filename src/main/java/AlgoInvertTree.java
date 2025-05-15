public class AlgoInvertTree {
    public static void main(String[] args) {
    }
    public class TreeNode {
        // Значение узла (например: 4, 2, 7 и т.д.)
        private Integer value;
        // Левый и правый дочерние узлы (рекурсивные ссылки на другие TreeNode).
        private TreeNode left;
        private TreeNode right;
    }

    static void invert(TreeNode node) {
        if (node == null) return;

        // Рекурсивно инвертирует левое поддерево.
        invert(node.left);
        // Рекурсивно инвертирует правое поддерево.
        invert(node.right);
        // ⚠️ Эти вызовы происходят до обмена — сначала уходим вглубь дерева,
        // начиная снизу (обратный обход, post-order).

        TreeNode temp;
        // сохраняем левую ветку
        temp = node.left;
        // правую перемещаем в левую
        node.left = node.right;
        // а сохранённую левую ставим в правую
        node.right = temp;
    }
}

// Input [4, 2,7,1,3,6,9]
// Output [4, 7, 2,9,6,3,1]
//        4
//       / \
//      2   7
//      /\  /\
//     1 3  6 9
//
//        4
//       / \
//      7   2
//     /\   /\
//    9  6  3 1
//    Написать метод, который будет инвертировать дерево
//    (менять местами 2 и 7, 1369 -> 9631
