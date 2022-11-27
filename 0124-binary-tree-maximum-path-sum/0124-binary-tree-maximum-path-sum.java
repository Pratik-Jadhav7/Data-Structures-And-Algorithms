/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return max;
    }
     int sum(TreeNode root){
        if(root==null) return 0;
        
        int l = Math.max(sum(root.left),0);
        int r = Math.max(sum(root.right),0);
        
        max = Math.max(max, root.val+l+r);
        
        return root.val+ Math.max(l,r);
    }
}