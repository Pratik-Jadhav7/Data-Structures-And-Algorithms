
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i = 0;
        int j = n - 1;
        while (i < j) {
            res[i] = i + 1;
            res[j] = -(i + 1);
            i++;
            j--;
        }
        if (i == j) {
            res[i] = 0;
        }
        return res;       
    }
}