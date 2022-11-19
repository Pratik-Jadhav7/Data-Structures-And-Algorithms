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
   public boolean isSameTree(TreeNode p, TreeNode q) {
    // iteration method
    if (p == null && q == null) return true;
    if (p == null && q != null || p != null && q == null) return false;
    Stack<TreeNode> stackP = new Stack<>();
    Stack<TreeNode> stackQ = new Stack<>();
    stackP.add(p);
    stackQ.add(q);
    while (!stackP.isEmpty() && !stackQ.isEmpty()) {
        TreeNode tmpP = stackP.pop();
        TreeNode tmpQ = stackQ.pop();
        if (tmpP.val != tmpQ.val) return false;
        if (tmpP.left != null && tmpQ.left != null) {
            stackP.push(tmpP.left);
            stackQ.push(tmpQ.left);
        } else if (tmpP.left == null && tmpQ.left == null) {
        } else {
            return false;
        }
        if (tmpP.right != null && tmpQ.right != null) {
            stackP.push(tmpP.right);
            stackQ.push(tmpQ.right);
        } else if (tmpP.right == null && tmpQ.right == null) {
        } else {
            return false;
        }
    }
    if (!stackP.isEmpty() || !stackQ.isEmpty()) return false;
    return true;
}
}