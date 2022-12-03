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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    public boolean helper(TreeNode root, Integer minval, Integer maxval){
        if(root == null) return true;
        
       if ((minval != null && root.val <= minval) || (maxval != null && root.val >= maxval))
            return false;
        return helper(root.left, minval, root.val) && helper(root.right, root.val, maxval);
        }
         
}
