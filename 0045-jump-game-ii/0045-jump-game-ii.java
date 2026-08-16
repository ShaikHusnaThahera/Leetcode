class Solution {
    public int jump(int[] nums) {
      int l=0;int r=0;
      int jump=0;
      int n=nums.length;
      while(r<n-1){
        int far=0;
        for(int ind=l;ind<=r;ind++){
            far=Math.max(ind+nums[ind],far);
        }
        l=r+1;
        r=far;
        jump+=1;
      }
      return jump;
    }
}