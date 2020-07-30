//Problem: "Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array."
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        m--; //keep track of which number from nums1
        n--; //keep track of which number from nums2
        int index = nums1.length-1;
        while (index>=0){
            //if nums1's numbers have already been inserted
            if (m<0){
                nums1[index] = nums2[n--];
            }
            //if nums2's numbers have already been inserted
            else if (n<0){
                nums1[index] = nums1[m--];
            }
            else { //compare the biggest numbers from nums1 and nums2, whichever is bigger is placed at the index position
                if (nums1[m]>nums2[n]){
                    nums1[index]=nums1[m--];
                }
                else {
                    nums1[index] = nums2[n--];
                }
            }
            index--;
            
        }
    }
}