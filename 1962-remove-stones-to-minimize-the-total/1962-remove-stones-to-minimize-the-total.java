// Algorithm:

// Think Greedily – if we remove stones from the biggest piles first, we will get the optimal result, so the data structure that comes to mind is Max Heap.

// Create a max heap.
// Push all the piles [i] into the heap.
// Iterate until k > 0.
// Pop from the heap and decrement the value by floor (val / 2) and push the resultant value back in to the heap.
// Finally, pop all the remaining elements in the heap and total them and return the sum.
class Solution {
    public int minStoneSum(int[] piles, int k) {
        Queue <Integer> heap = new PriorityQueue (new Comparator <Integer> () {
           public int compare (Integer a, Integer b) {
               if (a < b)
                   return 1;
               else if (a > b)
                   return -1;
               else
                   return 0;
           } 
        });
        for (int val : piles)
            heap.offer (val);
        while (k-- > 0) {
            int stones = heap.poll ();
            stones -= (int) (Math.floor (stones / 2));
            heap.offer (stones);
        }
        int sum = 0;
        while (!heap.isEmpty ())
            sum += heap.poll ();
        return sum;
    }
}