class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int temp=0,l=0,ans=Integer.MAX_VALUE;
     for(int r=0;r<nums.length;r++){
         temp+=nums[r];
         while(temp>=target){
             ans=Math.min(ans,r-l+1);
             temp-=nums[l];
             l++;
         }
     }
     if(ans==Integer.MAX_VALUE){
         return 0;
     }else
     return ans;
    }
}