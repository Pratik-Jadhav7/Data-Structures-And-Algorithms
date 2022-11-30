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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        
       Stack<TreeNode> lStack = new Stack<>();
       Stack<TreeNode> rStack = new Stack<>();
        lStack.push(root.left); rStack.push(root.right);
        
          while (lStack.size() > 0 && rStack.size() > 0)  {
                TreeNode t1 = lStack.pop();
    TreeNode t2 = rStack.pop();
               if (t1 == null && t2 == null) continue;
    if (t1 == null || t2 == null) return false;
                if (t1.val != t2.val) return false;
               lStack.push(t1.right); lStack.push(t1.left); // could be null
    rStack.push(t2.left);  rStack.push(t2.right);
    }
  // One of the stack might be empty
  return lStack.size() == 0 && rStack.size() == 0;
}
}