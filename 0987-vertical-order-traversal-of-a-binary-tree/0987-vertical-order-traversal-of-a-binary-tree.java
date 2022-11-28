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
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        // map of vertical level(v),  horizontal level(h) ,all nodes at (v,h)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        
        vertical(root, map, 0, 0); // traverse in tree and fill the map 
        
		List<List<Integer>> res = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> vlevels: map.values()){
            
            res.add(new ArrayList<>()); // add a new list
            
            for(PriorityQueue<Integer> hlevels: vlevels.values()){
                
                // add all elements of hlevels pq in last added list
                while(!hlevels.isEmpty()){
                    res.get(res.size()-1).add(hlevels.poll());
                }
            }
        }
        return res;
    }
    
    void vertical(TreeNode root, TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map, int vlevel, int hlevel){
        
        if(root == null) return;
        
        // if vertcal level is not already present in map
        if(!map.containsKey(vlevel)) map.put(vlevel, new TreeMap<>());
        
        // if horizontal level is not already present in map
        if(!map.get(vlevel).containsKey(hlevel)) 
            map.get(vlevel).put(hlevel, new PriorityQueue<>());
        
        // put current node in map
        map.get(vlevel).get(hlevel).add(root.val);
        
        /* call in left : 
                  while calling in left
                            hlevel will increase by 1 
                            vlevel will decrease by 1
        */
        vertical(root.left, map, vlevel-1, hlevel+1);
        
        /* call in right : 
                  while calling in right
                            hlevel will increase by 1 
                            vlevel will increase by 1
        */
        vertical(root.right, map, vlevel+1, hlevel+1);
        
    }
    
}