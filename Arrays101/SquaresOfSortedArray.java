//Problem : "Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order."
class Solution {
    public int[] sortedSquares(int[] A) {
        //First square all numbers in A
        int[] squaredA = new int[A.length];
        for (int i = 0;i < A.length; i++){
            squaredA[i] = A[i]*A[i];
        }
        //Sort 'squaredA' in non-decreasing order using bubble sort
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < A.length - 1; i++){
                if (squaredA[i]>squaredA[i+1]){
                    int temp = squaredA[i];
                    squaredA[i] = squaredA[i+1];
                    squaredA[i+1] = temp;
                    sorted = false;
                        
                }
            }
        }
        return squaredA;
    }
}