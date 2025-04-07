public class BTClass {
    BTNode root;

    public BTClass() {
        root = null;
    }

    public BTClass(BTNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void inorder(BTNode node) {
        if (node != null) {
            inorder(node.lLink);
            System.out.print(" " + node.data);
            inorder(node.rLink);
        }
    }

    public void preorder(BTNode node) {
        if (node != null) {
            System.out.print(" " + node.data);
            preorder(node.lLink);
            preorder(node.rLink);
        }
    }

    public void postorder(BTNode node) {
        if (node != null) {
            postorder(node.lLink);
            postorder(node.rLink);
            System.out.print(" " + node.data);
        }
    }
}
