// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int index = nums1.length - 1;
        
//         while(m>0 && n>0){
            
// //             starting from last index
//             if(nums1[m-1]<nums2[n-1]){
//                 nums1[index--]= nums2[--n];
//             } else {
//                 nums1[index--] = nums1[--m];
//             }
//         }
        
// //         all remaining nums1 values
//             while(m>0){
//                 nums1[index--]= nums1[--m];
//             }
        
// //         all remianing nums2 values
//             while(n>0){
//                 nums1[index--]= nums2[--n];
//             }
//         }
        
//     }
