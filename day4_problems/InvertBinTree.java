class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val=val;
    }

}

public class InvertBinTree{
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode temp= root.right;
        root.right=root.left;
        root.left=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    


    }

    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

    }


}