package app;

import java.util.*;
import tree.*;

public class App {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        int[] values = {50,17,76,9,23,54,14,19,72,12,67};

        for (int v : values) {
            tree.insert(v);
        }

        System.out.println("=== ORIGINAL TREE ===");

        System.out.println("Nodes: " + TreeUtils.countNodes(tree.root));
        System.out.println("Edges: " + TreeUtils.countEdges(tree.root));
        System.out.println("Height: " + TreeUtils.height(tree.root));

        System.out.print("Inorder: ");
        TreeUtils.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder: ");
        TreeUtils.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        TreeUtils.postorder(tree.root);
        System.out.println();

        System.out.print("Level-order: ");
        TreeUtils.levelOrder(tree.root);
        System.out.println();


        // ===== BALANCED TREE =====

        System.out.println("\n=== BALANCED TREE ===");

        List<Integer> sortedList = new ArrayList<>();
        TreeUtils.toList(tree.root, sortedList);

        BinaryNode balancedRoot =
                TreeUtils.buildBalanced(sortedList, 0, sortedList.size() - 1);

        System.out.println("Nodes: " + TreeUtils.countNodes(balancedRoot));
        System.out.println("Edges: " + TreeUtils.countEdges(balancedRoot));
        System.out.println("Height: " + TreeUtils.height(balancedRoot));

        System.out.print("Inorder: ");
        TreeUtils.inorder(balancedRoot);
        System.out.println();

        System.out.print("Level-order: ");
        TreeUtils.levelOrder(balancedRoot);
        System.out.println();
    }
}
