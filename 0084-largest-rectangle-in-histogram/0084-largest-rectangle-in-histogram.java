class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st=new Stack<>();
        int maxarea=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            int start=i;
            while(!st.isEmpty()&&heights[i]<st.peek()[0]){
                int top[]=st.pop();
                int h=top[0];
                int ind=top[1];
                int width=i-ind;
                int area=h*width;
                maxarea=Math.max(area,maxarea);
                start=ind;
            }
            st.push(new int[]{heights[i],start});
        }
         while(!st.isEmpty()){
                int top[]=st.pop();
                int h=top[0];
                int ind=top[1];
                int width=n-ind;
                int area=h*width;
                maxarea=Math.max(area,maxarea);
            }
        return maxarea;
    }
}