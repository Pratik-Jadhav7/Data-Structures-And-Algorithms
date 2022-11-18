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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        solve(res,root);
        return res;
    }
    
    private void solve(List<Integer> res, TreeNode root){
        if(root == null) return;
        
		// Traverse left node
        solve(res, root.left);
		
		// Traverse parent node
        res.add(root.val);
		
		// Traverse right node
        solve(res, root.right);
    }
}



// Using Stack

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
        
//         TreeNode curr = root;
//         Stack<TreeNode> stack = new Stack<>();
//         while(curr != null || stack.size() != 0){
            
//             // Move to the left-most node of the tree and push them in stack for future traversal
//             while(curr != null){
//                 stack.push(curr);
//                 curr = curr.left;
//             }
            
//             // Left node
//             curr = stack.pop();
            
//             // Parent node
//             res.add(curr.val);
            
//             // Right node
//             curr = curr.right;
//         }
        
//         return res;
//     }
// }