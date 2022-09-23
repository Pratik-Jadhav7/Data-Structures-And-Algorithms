class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int toRemove = length * 5 / 100;
        int total = 0;
        for (int number: arr) {
            total += number;
        }
        for (int i=0; i<toRemove; i++)
            total -= arr[i];
        for (int i=length-1; i>= length-toRemove; i--)
            total -= arr[i];
        length -= (2 * toRemove);
        return (double) ((double)total / (double)length);
    }
}






class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        double total = 0;
        int i = n/20;   // start from element after first 5% elements
        int j = n - n/20;  // // till element before last 5% elements
        int new_len = n - 2*(n/20);   // excluding first 5% and last 5% elements
        while(i < j){
            total += arr[i];
            i++;
        }
        return total/new_len;
     }
}
