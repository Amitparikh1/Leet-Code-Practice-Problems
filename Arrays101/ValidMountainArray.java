/*Problem: 
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]

*/
class Solution {
    public boolean validMountainArray(int[] A) {
        //Must be at least 3 indices long
        if (A.length<3){
            return false;
        }
        int peak = 0; //This will store the index of the greatest value
        
        while (peak+1<A.length && A[peak] < A[peak+1]){
            peak++;
        }
        //If no peak was found return false
        if (peak == 0 || peak+1 >= A.length){
            return false;
        }
        while (peak+1<A.length){
            // if not strictly decreasing return false
            if (A[peak]<=A[peak+1]){
                return false;
            }
            peak++;
        }
        return true;
    }
}