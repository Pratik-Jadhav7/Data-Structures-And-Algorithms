class Solution {
    public TreeNode sorted(int nums[], int left, int right) {
        if (left == right) return new TreeNode(nums[left]);
        else if (left > right) return null;
        else {
            int mid = (left + right) / 2;
            TreeNode curr = new TreeNode(nums[mid]);
            curr.left = sorted(nums, left, mid - 1);
            curr.right = sorted(nums, mid + 1, right);
            return curr;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length - 1);
    }
}
