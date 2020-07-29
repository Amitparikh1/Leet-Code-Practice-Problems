/*Problem: "Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function."
*/
class Solution {
    public void duplicateZeros(int[] arr) {
        int numDuplicated = 0;
        int length = arr.length-1;
        //Find number of duplicated zeros
        for (int i = 0; i<=length - numDuplicated;i++){
            if (arr[i]==0){
                //edge case
                if (i==length - numDuplicated){
                    arr[length] = 0;
                    length--;
                    break; //this would be the last 0 only
                }
                numDuplicated++;
            }
        }
        //Shift positions
        for (int i = length - numDuplicated;i>=0;i--){
            if (arr[i]==0){
                arr[i+numDuplicated]=0;
                numDuplicated--;
                arr[i+numDuplicated]=0;
            }
            else {
                arr[i+numDuplicated]=arr[i];
            }
        }
        return;
    }
}
