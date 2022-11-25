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
// Method 2: Iterative DFS
// Time: O(n)
// Space: O(height)
public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
  if (t1 == null) {
    return t2;
  }
  // Use stack to help DFS
  Deque<TreeNode[]> stack = new LinkedList<>();
  stack.offerLast(new TreeNode[] {t1, t2});
  while (!stack.isEmpty()) {
    TreeNode[] cur = stack.pollLast();
    // no need to merge t2 into t1
    if (cur[1] == null) {
      continue;
    }
    // merge t1 and t2
    cur[0].val += cur[1].val;
    // if node in t1 == null, use node in t2 instead
    // else put both nodes in stack to merge
    if (cur[0].left == null) {
      cur[0].left = cur[1].left;
    } else {
      stack.offerLast(new TreeNode[] {cur[0].left, cur[1].left});
    }
    if (cur[0].right == null) {
      cur[0].right = cur[1].right;
    } else {
      stack.offerLast(new TreeNode[] {cur[0].right, cur[1].right});
    }
  }
  return t1;
}
}