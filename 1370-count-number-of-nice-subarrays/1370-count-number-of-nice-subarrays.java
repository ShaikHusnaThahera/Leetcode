class Solution {
   public static int fun(int[] nums,int k){
    int l=0,ans=0,temp=0;
       for(int r=0;r<nums.length;r++){
           if(nums[r]%2!=0){
               temp++;
           }
           while(temp>k){
               if(nums[l]%2!=0){
                   temp--;
               }
               l++;
           }
          ans+=r-l+1;
       }
      return ans;
}
 public int numberOfSubarrays(int[] nums, int k) {
      return fun(nums,k)-fun(nums,(k-1));
   }
}