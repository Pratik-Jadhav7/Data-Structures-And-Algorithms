class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sizeOfRes = 0, n = nums.length;
        for(int i = 0; i < n; i = i + 2){
            sizeOfRes += nums[i];
        }
        int[] res = new int[sizeOfRes];
        int indxInRes = 0;
        for(int i = 0; i < n; i = i + 2){
            for(int j = 1; j <= nums[i]; j++){
                res[indxInRes++] = nums[i + 1];
            }
        }
        return res;
    }
}
