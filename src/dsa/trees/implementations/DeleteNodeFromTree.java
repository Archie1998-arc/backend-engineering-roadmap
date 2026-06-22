package dsa.trees.implementations;

public class DeleteNodeFromTree {
    public static void main(String[] args) {
        TreeNode root ;
        TreeNode one = new TreeNode(10);
        TreeNode two = new TreeNode(5);
        TreeNode three = new TreeNode(15);
        TreeNode four = new TreeNode(3);
        TreeNode five = new TreeNode(6);
        TreeNode six = new TreeNode(12);
        TreeNode seven = new TreeNode(20);

        one.left =two;
        one.right =three;
        two.left= four;
        two.right =five;
        three.left =six;
        three.right =seven;

        root =one;
        TreeImpl.inorderTraversal(root);

    }
    public static void deleteNodeFromTree(TreeNode root, int val){
    }
}
