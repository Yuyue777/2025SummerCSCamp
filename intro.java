// Definition for a binary tree node.
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
class Solution {
    public int maxDepth(TreeNode root) {
    if(root == null){
        return 0;
    }
    }
    public int getMaxDepth(TreeNode root, int level) {
       if(root.left == null && root.right == null)
           return level;
       if(root.left != null && root.right == null)
           return getMaxDepth(root.left, level + 1);
       if(root.left == null && root.right != null)
            return getMaxDepth(root.right, level + 1);
        if(root.left != null && root.right != null)
            return Math.max (getMaxDepth(root.right, level + 1),getMaxDepth(root.left, level + 1));
        }
}
