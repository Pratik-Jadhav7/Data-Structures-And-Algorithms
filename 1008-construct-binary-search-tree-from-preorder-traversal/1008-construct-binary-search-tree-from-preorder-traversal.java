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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
    private TreeNode helper(int[] arr, int bound){
        if(i == arr.length || arr[i] > bound ) return null;
        
        TreeNode root = new TreeNode(arr[i++]);
        
        root.left = helper(arr, root.val);
        root.right = helper(arr, bound);
        return root;
    }
}