class Solution {
    public int maxConsecutiveAnswers(String nums, int k) {
         int cf=0,ct=0,l=0,ans=0;
      for(int r=0;r<nums.length();r++){
        char ch=nums.charAt(r);
          if(ch=='T'){
              ct++;
          }
          else{
              cf++;
          }
          while(Math.min(cf,ct)>k){
              if(nums.charAt(l)=='T'){
                  ct--;
              }
              else{
                  cf--;
              }
              l++;
          }
          ans=Math.max(ans,r-l+1);
      }
      return ans;
    }
}