class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum=0;
        
        // itearting though every element in the array
        for(int i=0;i<arr.length;i++)
        {
            //adjusting the window size
            for(int j=i;j<arr.length;j+=2)
            {
                for(int k=i;k<=j;k++)
                sum+=arr[k];
            }
        }
        return sum;
        
    }
}