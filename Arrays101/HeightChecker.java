/*
Problem:
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
*/
class Solution {
    public int heightChecker(int[] heights) {
        int[] a = Arrays.copyOfRange(heights, 0, heights.length);
        Arrays.sort(a);
        
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}