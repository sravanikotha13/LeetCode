/***

Problem Statement:

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 

Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5

***/

class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = 0;
        int i =0, j = 0;
        int size = arr.length;
        while(i<size){
            j = i+1;
            while(j<size){
                if(arr[j]>max)
                    max = arr[j];
                j++;
            }
            arr[i] = max;
            max = 0;
        i++;
        }
        arr[size-1] = -1;
        return arr;
    }
}
