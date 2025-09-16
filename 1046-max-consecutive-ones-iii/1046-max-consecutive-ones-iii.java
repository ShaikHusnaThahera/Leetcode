class Solution {
    public int longestOnes(int[] nums, int k) {
       int ans=0,l=0,count=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]==0){
            count+=1;
        }
        while(count>k){
            if(nums[l]==0){
                count--;
            }
            l=l+1;
        }
        ans=Math.max(ans,r-l+1);
       }
       return ans;
    }
}