package tree;

public class BinaryTree {

    public BinaryNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private BinaryNode insertRec(BinaryNode node, int data) {
        if (node == null) {
            return new BinaryNode(data);
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }

        return node;
    }
}
