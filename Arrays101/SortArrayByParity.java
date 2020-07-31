/*
Problem: 
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
*/
class Solution {
    public int[] sortArrayByParity(int[] A) {
        //Variables
        int[] sortedArray = new int[A.length];
        int leftPointer=0;
        int rightPointer = A.length-1;
        
        //Loop through and sort
        for (int number:A){
            if (number%2==0){ //even numbers
                sortedArray[leftPointer++] = number;
            }
            else { //odd numbers
                sortedArray[rightPointer--] = number;
            }
        }
        return sortedArray;
    }
}