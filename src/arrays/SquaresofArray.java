package arrays;
/*Problem Statement:

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

 

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Note :
1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.

################################################################################################

Solution:
*/
class Solution {
    public int[] sortedSquares(int[] A) {
        
        int len = A.length;
        
        for(int i=0; i<len; i++)            
            A[i] = A[i] * A[i];
        
        Arrays.sort(A);
        
        return A;
    }
}



