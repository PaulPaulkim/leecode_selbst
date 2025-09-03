public class java222 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    static class Solution{
        
        public int countNodes(TreeNode root){
            if(root == null) {return 0;}
            int lh = getLeftHeight(root);
            int rh = getRightHeight(root);

            if(lh == rh){
                return (1<<lh) -1;
            }else{
                return 1+ countNodes(root.left) + countNodes(root.right);
            }
    }
    private int getLeftHeight(TreeNode node){
        int h = 0;
        while(node != null){
            h++;
            node = node.left;
        }
        return h;
    }
    private int getRightHeight(TreeNode node){
        int h = 0;
        while(node != null){
            h++;
            node = node.right;
        }
        return h;
    }
}
}
