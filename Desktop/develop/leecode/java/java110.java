public class java110 {
    public boolean isBalanced(TreeNode root){
        return checkHeigt(root) != -1;
    }

    private int checkHeigt(TreeNode node){
        if(node == null) return 0;

        int leftHeight = checkHeigt(node.left);
        if(leftHeight == -1) return -1;

        int rightHeight = checkHeigt(node.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        return Math.max(leftHeight, rightHeight)+1;
    }
    
}
