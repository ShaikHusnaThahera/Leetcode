class Solution {
     public static int fun(int nums[],int k){
    int l=0,ans=0,temp=0;
   if(k<0){
       return 0;
   }
       for(int r=0;r<nums.length;r++){
           temp+=nums[r];
           while(temp>k && l<=r){
               if(nums[l]==1){
                   temp--;
               }
               l++;
           }
          ans+=r-l+1;
       }
    //   System.out.println(ans);
      return ans;
}
    public int numSubarraysWithSum(int[] nums, int k) {
           return (fun(nums,k)-fun(nums,(k-1)));
    }
}