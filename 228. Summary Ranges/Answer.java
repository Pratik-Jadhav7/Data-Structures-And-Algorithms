class Solution {
   public List<String> summaryRanges(int[] nums) {
        
        List<String> rangeStrings = new ArrayList();
        
        for(int i=0;i<nums.length;i++){
            
            int startIndex = i;
            while(i<(nums.length-1) && (nums[i]+1) == nums[i+1])
                i++;
        
            if(startIndex != i)
                rangeStrings.add(nums[startIndex]+"->"+nums[i]);
            else
                rangeStrings.add(""+nums[startIndex]); 
        }
        
        return rangeStrings;
    }
}
