import java.util.*;

// Generic Node class
class TreeNode<T> {
    T data;
    TreeNode<T> left, right;

    TreeNode(T data) {
        this.data = data;
        left = right = null;
    }
}

// Generic Binary Tree class
class BinaryTree<T> {
    TreeNode<T> root;

    // Depth-First Traversals
    public void inOrder(TreeNode<T> node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(TreeNode<T> node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(TreeNode<T> node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // Breadth-First Traversal (Level Order)
    public void levelOrder(TreeNode<T> node) {
        if (node == null) return;
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}

public class GenericBinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        // Constructing the tree manually
        tree.root = new TreeNode<>(1);
        tree.root.left = new TreeNode<>(2);
        tree.root.right = new TreeNode<>(3);
        tree.root.left.left = new TreeNode<>(4);
        tree.root.left.right = new TreeNode<>(5);
        tree.root.right.left = new TreeNode<>(6);
        tree.root.right.right = new TreeNode<>(7);

        System.out.println("In-Order Traversal:");
        tree.inOrder(tree.root);
        System.out.println("\nPre-Order Traversal:");
        tree.preOrder(tree.root);
        System.out.println("\nPost-Order Traversal:");
        tree.postOrder(tree.root);
        System.out.println("\nLevel-Order Traversal:");
        tree.levelOrder(tree.root);
    }
}
