class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
//         intializing maximum number 
       
        
//         creating result array
        ArrayList<Boolean> result = new ArrayList<>(candies.length);
       
         int max = candies[0];
        
//         running loops and if conditions 
        for(int i=1; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        for(int candy: candies){
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}