// Problem: "Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M)."
class Solution {
    public boolean checkIfExist(int[] arr) {
        //loop through each number - this number will be half of numberTwo if it is a match
        for (int i = 0; i<arr.length;i++){
            //loop through for second number - this number will be double numberOne if it is a match
            for (int j = 0; j<arr.length;j++){
                if (arr[i]*2==arr[j] && i!=j){
                    return true;   
                }
            }
        }
        return false;
        
    }
}