// Problem: "Given a binary array, find the maximum number of consecutive 1s in this array."
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int consecutiveOnes = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                consecutiveOnes ++; 
                if (consecutiveOnes>maxConsecutiveOnes) {
                maxConsecutiveOnes = consecutiveOnes;
                }
            }
            else {
                consecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
        
    }
}