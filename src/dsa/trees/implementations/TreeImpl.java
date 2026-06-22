package dsa.trees.implementations;
public class TreeImpl {
    public static void main(String[] args) {

    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + ", ");
        inorderTraversal(root.right);

    }
}
class TreeNode{
    int data ;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}
