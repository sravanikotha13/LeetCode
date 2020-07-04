/***** 
Problem Statement:

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.


*****/

class Solution {
    public void moveZeroes(int[] nums) {
        

       int inc = 0;
       int size = nums.length;
        
        for(int r=0; r<size; r++){
            if(nums[r] != 0)
                nums[inc++] = nums[r];
        }  
        
        while(inc < size)
            nums[inc++] = 0;
    }
}
