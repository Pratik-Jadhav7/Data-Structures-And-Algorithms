class Solution {
   public int[] sortArrayByParity(int[] nums) {
        
        int start = 0, end = nums.length - 1;
        
        while(start < end) {
            
            if(nums[start] % 2 == 0)
                start++;
            
            if(nums[end] % 2 != 0)
                --end;
            
             if(start < end && nums[start] % 2 != 0 && nums[end] % 2 == 0) {
                 int temp = nums[start];
                 nums[start] = nums[end];
                 nums[end] = temp;
                 ++start;
                 --end;
             }
            
        }
        return nums;
    }
}
