class Solution {
    public int maxArea(int[] height) {
  
 //We are going to use two pointer at each point we are going to check and update the max value only if the current value   is greater than max else we are going to skip it. "Note:In this area every value denotes a vertical line"
        
        
        int first=0;//--------->The first point starts from the beginning of the array
        
        int last=height.length-1; //-----------> the second point is set to the last index in the array
        
        int Area=0; 
// we don't know the answer for the area so intially it's going to be 0 and The formula to find the value
 //Of Area is "Area=length of shorter vertical line * distance between lines"
        
        while(first<last) // The condition will break if indices are equal 
        { 
            if(height[first] < height[last])
// The first part of the problem is find the smaller value between the two values so we can use it to fing the area this condition will execute if our first value is smaller than the last.
            { 
 //if the condition is met the second part is to find the Area between Area(it's 0 for the first step) and the Area value we will get from the formula after substituting our small value and length then we will update the Area.
 //After updating the area we will increment the first pointer if first pointer value > second pointer the below (else) condition will execute .
                Area = Math.max(Area, height[first] * (last - first));
                first++;
            }
            else
            {
                Area = Math.max(Area,height[last] * (last-first));
                last--;
            }
//The above two conditions will execute alternatively depending upon the first and last value and it'll update the Area also . when the while condition break our Area hold the maximum value from the array then we will return it. 
        }
        return Area;
    }
}