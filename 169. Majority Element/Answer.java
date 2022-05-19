class Solution {
    public int majorityElement(int[] nums) {
//         initialisation;
        int res = 0;
        int count = 1;
        
//         run for loop to compare all values
        for(int i=0; i<nums.length; i++){
            
//             compare that perticular element with all other elements
            if(nums[res] == nums[i]){
                count++;
            } else {
                count--;
            }
            
//             if no duplicate of that number present then value is 0
            if(count == 0){
                res=i;
                count=1;
            }
        }
        return nums[res];
        
    }
}
