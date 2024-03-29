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
    public boolean checkTree(TreeNode root) {
        return root.val  == root.left.val + root.right.val;
        
    }
}



class Solution {
    public boolean checkTree(TreeNode root) {
       int values = root.left.val + root.right.val;
        if(values == root.val) {
            return true;
            }
        return false;
    }
}
