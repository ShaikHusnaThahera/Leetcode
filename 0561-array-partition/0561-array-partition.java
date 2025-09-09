class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
      int ans=0;
      int n=nums.length;
      for(int i=0;i<n;i=i+2){
           ans=ans+nums[i];
      }
     return ans;
    }
}