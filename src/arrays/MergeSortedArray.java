/** 
Problem Statement:
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
**/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      int len = (m+n);
		  int i =0, j = 0;
        
        if(n == 0)
            return;
		
      while(j<n && i<len){
        if(nums1[i] >= nums2[j])
              {
                  for(int p=len-2; p>=i; p--){
                  nums1[p+1] = nums1[p];
               }

          nums1[i] = nums2[j];
          j++;
        }
        i++;
      }
      for(int k =j; k<n; k++){
        nums1[(m+k)] = nums2[k];
      }
    }
}
