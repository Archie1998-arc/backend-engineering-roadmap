package dsa.trees.implementations;

public class FindKthElement {
    public static void main(String[] args) {
        int[] counter ={0};
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

        TreeNode root1;
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(4);
        TreeNode n8 = new TreeNode(2);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n5.left = n6;
        n6.left = n7;
        n7.left = n8;
        root1 = n1;

        TreeImpl.inorderTraversal(root);
        System.out.println();

        System.out.println(findKthElement(root,5,counter));
    }
    public static TreeNode inorderTraversal(TreeNode root){
        if(root.left ==null ) return root;
        else{
            return inorderTraversal(root.left);
        }
    }
    public static int  findKthElement(TreeNode root,int k, int[] count){
        if(root == null) return -1;
        int result = findKthElement(root.left,k,count);
        count[0]+=1;
        if(count[0] == k ) return root.data;
        if(result != -1 ) return result;
        result = findKthElement(root.right,k,count);
        return result;

    }
}
