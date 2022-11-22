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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        postorder(root);
        
        return list;
        
    }
    
    public void postorder(TreeNode root){
        if(root==null){
            return;
        }
       postorder(root.left);
        postorder(root.right);
        list.add(root.val);
        
        return;
    }
}