class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        
        int w = nums[0];
        int x = nums[1];
        int y = nums[nums.length-2];
        int z = nums[nums.length-1];
        
        return (y*z) - (w*x);
        
    }
}