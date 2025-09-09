class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
      int ans=0;
      int n=nums.length;
     int s=0;
      for(int i=0;i<n;i++){
         if(i%2==0)
           ans=ans+nums[i];
          s++;
      }
     return ans;
    }
}