class Solution {
    public void duplicateZeros(int[] arr) {
        int numDuplicated = 0;
        
        //Find number of duplicated zeros
        for (int i = 0; i<arr.length-numDuplicated;i++){
            if (arr[i]==0){
                //edge case
                if (i==arr.length-numDuplicated-1){
                    
                }
                numDuplicated++;
            }
        }
        return;
    }
}