Brute
Time - O(n^2)

Code

public int[] nextGreaterElementBrute(int[] nums1, int[] nums2) {
	int[] ans = new int[nums1.length];

	for(int i = 0; i < nums1.length; i++) {
		int greaterIdx = -1, j = nums2.length - 1;
		while(j >= 0 && nums2[j] != nums1[i]) {
			if(nums2[j] > nums1[i]){
				greaterIdx = nums2[j];
			}
			j--;
		}
		ans[i] = greaterIdx;
	}

	return ans;
}




Optimal
Time - O(n) 

Code

class Solution {
       public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
