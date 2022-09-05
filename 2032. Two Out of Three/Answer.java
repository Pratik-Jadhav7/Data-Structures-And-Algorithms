class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] flag1 = new boolean[101];
        boolean[] flag2 = new boolean[101];
        boolean[] flag3 = new boolean[101];
        
        for(int num: nums1){
            flag1[num] = true;
        }
        for(int num: nums2){
            flag2[num] = true;
        }
        for(int num: nums3){
            flag3[num] = true;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=1; i<=100; i++){
            if((flag1[i] || flag2[i]) && (flag2[i] || flag3[i]) && (flag3[i] || flag1[i])){
                ans.add(i);
            }
        }
        
        return ans;
    }
}
