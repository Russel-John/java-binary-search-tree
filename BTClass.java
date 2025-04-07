public class BTClass {
    BTNode rootNode;

    public BTClass() {
        rootNode = null;
    }

    public BTClass(BTNode rootNode) {
        this.rootNode = rootNode;
    }

    public boolean isEmpty() {
        return rootNode == null;
    }

    public void inorder(BTNode treeNode) {
        if (treeNode != null) {
            inorder(treeNode.leftLink);
            System.out.print(" " + treeNode.value);
            inorder(treeNode.rightLink);
        }
    }

    public void preorder(BTNode treeNode) {
        if (treeNode != null) {
            System.out.print(" " + treeNode.value);
            preorder(treeNode.leftLink);
            preorder(treeNode.rightLink);
        }
    }

    public void postorder(BTNode treeNode) {
        if (treeNode != null) {
            postorder(treeNode.leftLink);
            postorder(treeNode.rightLink);
            System.out.print(" " + treeNode.value);
        }
    }
}