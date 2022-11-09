class Solution {
    public int heightChecker(int[] heights) {
        int[] map = new int[101]; // heights go from 1 to 100
        for(int h: heights) ++map[h];
        
        int res = 0;
        int h_ptr = 1;
        
        for(int h: heights) {
            while(map[h_ptr] == 0) ++h_ptr;
            
            if(h_ptr != h) {
                ++res;
            }
            
            --map[h_ptr];
        }
        
        return res;
    }
}