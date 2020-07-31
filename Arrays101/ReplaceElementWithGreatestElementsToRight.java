/*Problem: 
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
*/
class Solution {
    public int[] replaceElements(int[] arr) {
        int index = 0; 
        while (index <arr.length){
            int greatestElement = -1;
            //find greatestElement among elements to the right of index
            for (int i = index+1;i<arr.length;i++){
                if (arr[i]>greatestElement){
                    greatestElement = arr[i];
                }
            }
            arr[index] = greatestElement;
            index++;
        }
        return arr;
    }
}