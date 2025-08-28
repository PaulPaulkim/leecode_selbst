import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class java144 {
    public static class TreeNode {
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
 
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.addFirst(node.val);

            if(node.left != null){stack.push(node.left);}
            if(node.right != null) {stack.push(node.right);}
       
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2,node4,node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1,node2, node3);
    }
}
    
