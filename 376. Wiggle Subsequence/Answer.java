class Solution {
    public int wiggleMaxLength(int[] arr) {
        int res = 0;
        int prev = 0;
        // 0 for initial, 1 for rising, 2 for falling
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                if (prev == 0) {
                    res++;
                    prev = 1;
                }
                if (prev == 2) {
                    res++;
                    prev = 1;
                }
            } else if (arr[i - 1] > arr[i]) {
                if (prev == 0) {
                    res++;
                    prev = 2;
                }
                if (prev == 1) {
                    res++;
                    prev = 2;
                }
            }
        }
        
        return res + 1;
    }
}