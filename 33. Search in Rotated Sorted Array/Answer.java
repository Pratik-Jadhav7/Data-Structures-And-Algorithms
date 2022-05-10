class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if(target == nums[mid])
                return mid;
            else if(nums[start] <= nums[mid])                    //check if 1st half is sorted
            {
                if(target >= nums[start] && target <= nums[mid]) // check if target lies in the 1st half
                    end = mid - 1;
                else                                             //search in right half
                    start = mid + 1;                    
            }
            else                                                //check for right half
            {
                if(target >= nums[mid] && target <= nums[end])  // check if target lies in 2nd half
                    start = mid + 1;
                else                                            // search in left half
                    end = mid - 1;
            }
        }
        
        return -1;
    }
    
}