class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        int n = nums.length;
        
        if(k >= n-1){
            k = n-1;
        }
        
        for(int i = 0; i <= k; i++){
            if(st.contains(nums[i])){
                return true;
            }
            st.add(nums[i]);
        }
        
        int j = 0;
        
        for(int i = k+1; i < n; i++){
            st.remove(nums[j++]);
            
            if(st.contains(nums[i])){
                return true;
            }
            st.add(nums[i]);
        }       
        return false;       
    }
}
