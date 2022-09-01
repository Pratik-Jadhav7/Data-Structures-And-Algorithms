class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int start = 0;  //record last different number's index
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[start])  
                continue;   //skip same
            else
            {
                nums[start+1] = nums[i]; // change the new different number as comparison (new one must be a bigger one, sorted array won't contain numbers equal to old comparison)
                start++;    // plus one when find a new one
            }
        }
        return start+1;  //return index+1 is length;
    }
}
