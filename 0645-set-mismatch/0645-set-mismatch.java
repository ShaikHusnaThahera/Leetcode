class Solution {
    public int[] findErrorNums(int[] nums) {
    HashSet<Integer> hr=new HashSet<>();
     int dup=-1;
      for(int i=0;i<nums.length;i++){
          int n=nums[i];
          if(!hr.contains(n)){
              hr.add(n);
          }
          else{
            dup=n;            }
      }
      int mis=0;
      for(int i=1;i<=nums.length;i++){
          if(!hr.contains(i)){
             mis=i;
          }
      }
 int ans[]={dup,mis};
return ans;
}
}