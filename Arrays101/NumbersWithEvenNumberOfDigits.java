//Problem: "Given an array nums of integers, return how many of them contain an even number of digits."
class Solution {
    public int findNumbers(int[] nums) {
        int solutionCounter = 0;
        for (int number: nums){
            int numOfDigits = 0;
            while (number>0){
                number = number/10;
                numOfDigits++;
            }
            if (numOfDigits % 2 == 0){
                solutionCounter++;
            }
        }
        return solutionCounter;
    }
}