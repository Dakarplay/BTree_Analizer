package tree;

import java.util.*;

public class TreeUtils {

    // Número de nodos
    public static int countNodes(BinaryNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Número de aristas
    public static int countEdges(BinaryNode node) {
        int nodes = countNodes(node);
        return (nodes == 0) ? 0 : nodes - 1;
    }

    // Altura
    public static int height(BinaryNode node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Inorder
    public static void inorder(BinaryNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Preorder
    public static void preorder(BinaryNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Postorder
    public static void postorder(BinaryNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // BFS
    public static void levelOrder(BinaryNode root) {
        if (root == null) return;

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    // Obtener lista ordenada (inorder)
    public static void toList(BinaryNode node, List<Integer> list) {
        if (node != null) {
            toList(node.left, list);
            list.add(node.data);
            toList(node.right, list);
        }
    }

    // Construir árbol balanceado desde lista ordenada
    public static BinaryNode buildBalanced(List<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        BinaryNode node = new BinaryNode(list.get(mid));

        node.left = buildBalanced(list, start, mid - 1);
        node.right = buildBalanced(list, mid + 1, end);

        return node;
    }
}