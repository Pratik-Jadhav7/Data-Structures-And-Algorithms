// this problem can be solved by O(n) time complexity if you make use of Map

class Solution {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i =0; i< nums.length; i++) {
                if(map.containsKey(target - nums[i])){
                    return new int[]{map.get(target - nums[i]), i};
                }else {
                    map.put(nums[i], i);
                }
            }
            return new int[]{-1,-1};
        }
    }

     MY OWN METHOD

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement; 
        //loop to check every element in the array
        for (int x = 0; x<nums.length; x++) {  
            complement = target - nums[x];
            //loop to find complement of current element
            for (int y = 0; y<nums.length; y++) { 
                //we cannot use same element twice.
                if (x ==  y) { continue; } 
                if (nums[y] == complement) {
                    return new int[] {x, y};
                }
            }            
        }
        return new int[] {0, 0};
    }
}
