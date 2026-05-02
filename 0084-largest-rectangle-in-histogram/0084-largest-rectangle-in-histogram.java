class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 1) return heights[0];
        int max = 0;
        int area = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<=heights.length; i++){
            int h = (i == heights.length? 0: heights[i]);
            while(!st.isEmpty() && h < heights[st.peek()]){
                int top = st.pop();
                int height = heights[top];
                int width = st.isEmpty()? i : i-st.peek()-1;
                area = height * width;
                max = Math.max(max, area);
            }
            st.push(i);
        }
        return max;
    }
}