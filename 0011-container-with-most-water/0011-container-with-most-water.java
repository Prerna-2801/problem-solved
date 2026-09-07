class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        int area = 0;
        int i = 0, j = n-1;
        while(i < j){
            area = Math.min(height[i], height[j]) * (j-i);
            if(area > max) max = area;
            if(height[i] < height[j]) i++;
            else j--; 
        }
        return max;
    }
}