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
    public static void main(String args[]){
        InvertBinTree obj= new InvertBinTree();
        TreeNode root= new TreeNode(1);  
        root.left= new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right= new TreeNode(5);

        System.out.print("og tree: ");
        obj.inorder(root);
        obj.invertTree(root);
        System.out.println("inverted tree: ");
        obj.inorder(root);

    }

}