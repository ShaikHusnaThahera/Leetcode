class Solution {
    public int majorityElement(int[] nums) {   
//    Arrays.sort(nums);
//    int n=nums.length;
//    return nums[n/2];
      HashMap<Integer,Integer> res=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        res.put(nums[i],res.getOrDefault(nums[i],0)+1);
      } 
      int ans=0;
      for(int s:res.keySet()){
        if(res.get(s)>nums.length/2){
            ans=s;
        }
      }
      return ans;
    }
}