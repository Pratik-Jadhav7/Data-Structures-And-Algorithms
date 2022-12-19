class Solution {
    public int numIdenticalPairs(int[] nums) {
        
    // initialise variable for return the number
      int p = 0;
        
        // Run outer for loop i
        for(int i=0; i<nums.length-1; i++){
            
            // Run inner for loop for j
            for(int j=i+1; j<nums.length; j++){
                
                // Apply if condition
                if(nums[i] == nums[j]) p++;
            }
        }
        return p;
    }
}




vava
