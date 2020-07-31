// Problem: "Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements."

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; //keeps track of index which we are inserting values into
        //loop through and place non-zero numbers at beginning in order
        for (int i = 0; i<nums.length;i++){
            if (nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        //fill end spots with zeros 
        while (index<nums.length){
            nums[index++] = 0;
        }
    }
}