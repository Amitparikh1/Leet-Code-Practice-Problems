/*
Problem: "Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory."
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 1; //don't need to check first index
        //number isn't already included in the array up to the index at 'length' add it
        for (int i = 1; i<nums.length;i++){ 
            if (nums[i]!=nums[i-1]){        
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}