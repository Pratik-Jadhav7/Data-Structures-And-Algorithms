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
    public List<Integer> preorderTraversal(TreeNode root) {
//         creat ArrayList to store element in inorder
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
//         base case where Tree is empty 
        if(root == null){
            return list;
        }
//         push root node in stack
        stack.push(root);
        
//         terminating condition
        while(!stack.isEmpty()){
//             poping the elements
            TreeNode temp = stack.pop();
            
//              adding value to the ArrayList
            list.add(temp.val);
            
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        return list;
    }
}