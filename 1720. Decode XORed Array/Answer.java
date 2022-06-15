class Solution {
    public int[] decode(int[] encoded, int first) {
        
//         creat a new array for Output
        int[] result = new int[encoded.length + 1];
        
//      assign "0th" index to first   
        result[0] = first;
        
//         run for loop for each index
        for(int i = 0; i<encoded.length; i++){
//             apply condition of XOR
            result[i+1] = encoded[i] ^ result[i];
        }
        return result;
    }
}