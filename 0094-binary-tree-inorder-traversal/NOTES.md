No1:

 List<Integer> ans = new ArrayList<>();

public List<Integer> inorderTraversal(TreeNode root) {
   if (root == null) return ans;
   inorderTraversal(root.left);
   ans.add(root.val);
   return inorderTraversal(root.right);
}
  
  
  
No2:

   public List<Integer> inorderTraversal(TreeNode root) {
	Stack<TreeNode> stack = new Stack<>();
	TreeNode cur = root;
	while (!stack.isEmpty() || cur != null) {
		while (cur != null) {
    		stack.push(cur);
    		cur = cur.left;
    	}
		cur = stack.pop();
		ans.add(cur.val);
		cur = cur.right;
 	}
	return ans;
}
