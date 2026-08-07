class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxwater=Integer.MIN_VALUE;
       while(low<=high){
        int minh=Math.min(height[low],height[high]);
        int width=high-low;
        int water=minh*width;
        maxwater=Math.max(maxwater,water);
        if(height[low]<=height[high]) low++;
         else high--;
        }
        return maxwater;
    }
}