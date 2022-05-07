class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Set<List<Integer>> res = new HashSet<>();
          Arrays.sort(nums);
          int target = 0;
          for(int i=0; i<nums.length-2; ++i) {
              if(i>0 && nums[i]==nums[i-1]) continue;
              int k=i+1;
              int l=nums.length-1;
              while(k<l) {
                  int sum = nums[i]+nums[k]+nums[l];
                  if(sum == target) {
                      res.add(Arrays.asList(new Integer[]{nums[i], nums[k], nums[l]}));
                      --l;
                  } else if(sum > target) {
                      --l;
                  } else {
                      ++k;
                  }
              }
          }
          return new ArrayList<>(res);
      }
  }