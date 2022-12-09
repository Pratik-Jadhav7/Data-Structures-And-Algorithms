Start with Brute force solution


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

	
	
	
	Recursion

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
	
	
	
	
Using Stack

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        while(curr != null || stack.size() != 0){
            
            // Move to the left-most node of the tree and push them in stack for future traversal
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            
            // Left node
            curr = stack.pop();
            
            // Parent node
            res.add(curr.val);
            
            // Right node
            curr = curr.right;
        }
        
        return res;
    }
}
