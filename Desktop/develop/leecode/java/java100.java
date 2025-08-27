public class java100 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean issameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return issameTree(p.left, q.left) && issameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.right = new TreeNode(2);
        p.left = new TreeNode(3);
        
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);
        q.right = new TreeNode(2);

        System.out.println(issameTree(p,q));

    }
}
