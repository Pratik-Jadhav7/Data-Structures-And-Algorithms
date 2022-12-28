class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for (int pile : piles) {
            pq.add(pile);
            ans += pile;
        }
        while (k-- > 0) {
            int p = pq.poll();
            pq.add(p - p / 2);
            ans -= p / 2;
        }
        return ans;
    }
}