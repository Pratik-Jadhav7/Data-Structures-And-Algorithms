Update - O(log n)
Sum Range - O(n) (worst case)

class NumArray {
    int[] segmentTree;
    int length;
    public NumArray(int[] nums) {
		// initialize segmenttree array
        segmentTree = new int[100005];
        length = nums.length - 1;
        build(nums, 0, 0, nums.length - 1);
    }
    
	// Build segment tree from the input array
	// O(n)
    private void build(int[] arr, int index, int beg, int end) {
		// base case, leaf node
        if(beg == end) {
            segmentTree[index] = arr[beg];
            return;
        }
        
        int mid = (beg + end) / 2;
		// the left child index will be 2 * index + 1 and right child index will be 2 * index + 2
		// same indexing concept as we use in implementing heap / priority queue
        build(arr, 2 * index + 1, beg, mid);
        build(arr, 2 * index + 2, mid + 1, end);
		
		// because we want to query for sum range, the sum for the current index range (beg to end) will be equal to the sum of values both its children
        segmentTree[index] = segmentTree[2 * index + 1] + segmentTree[2 * index + 2];
    }
    
    public void update(int index, int val) {
        pointUpdate(0, 0, length, index, val);
    }
    
	// Point update
	// O(log n)
    private void pointUpdate(int index, int beg, int end, int updateIndex, int val) {
	    // base case
        if(beg == end) {
            segmentTree[index] = val;
            return;
        }
        int mid = (beg + end) / 2;
        
		// similar to binary search or searching in a BST
		if(updateIndex >= beg && updateIndex <= mid) {
            pointUpdate(2 * index + 1, beg, mid, updateIndex, val);
        } else {
            pointUpdate(2 * index + 2, mid + 1, end, updateIndex, val);
        }
        
		// As the values get updated, the range sum must also be updated
        segmentTree[index] = segmentTree[2 * index + 1] + segmentTree[2 * index + 2];
    }
    
    public int sumRange(int left, int right) {
        return sumRange(0, 0, length, left, right);
    }
    
	// O(n) in the worst case (0 to n - 1)
    private int sumRange(int index, int beg, int end, int left, int right) {
		// the range completely or partially lies within the requested range
        if(beg >= left && end <= right) return segmentTree[index];
		
		// the range lies out of the requested range boundaries
        if(beg > right || end < left) return 0;
		
        int mid = (beg + end) / 2;
        int leftSubtree = sumRange(2 * index + 1, beg, mid, left, right);
        int rightSubtree = sumRange(2 * index + 2, mid + 1, end, left, right);
        return leftSubtree + rightSubtree;
    }
}
