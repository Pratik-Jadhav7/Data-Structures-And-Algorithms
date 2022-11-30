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
  if (root == null) {
    return true;
  }
  if (root.left == null && root.right == null) return true;
  if (root.left == null || root.right == null) return false;
  // children are not null
  Stack<TreeNode> stack = new Stack<>();
  stack.push(root.left);
  stack.push(root.right);
  
  while (stack.size() > 0) {
    TreeNode t1 = stack.pop();
    TreeNode t2 = stack.pop();
    // null check
    if (t1 == null && t2 == null) continue;
    if (t1 == null || t2 == null) return false;
    // value check
    if (t1.val != t2.val) return false;
    // push children
    stack.push(t1.right); stack.push(t2.left); // could be null
    stack.push(t1.left); stack.push(t2.right);
  }
  
  return true;
}
}