public class BSTImplementation {
    TreeNode root;
    TreeNode insert( TreeNode root, int val)
    {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        else if (val> root.val) {
            root.right = insert(root.right, val);
        }
        return  root;
    }

    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        IO.print(root.val + " ");
        inOrder(root.right);
    }

    static void main(String[] args) {
        BSTImplementation tree = new BSTImplementation();
        tree.root = null;
        tree.root = tree.insert(tree.root, 45);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 75);
        tree.root = tree.insert(tree.root, 24);

        tree.inOrder(tree.root);

    }
}
