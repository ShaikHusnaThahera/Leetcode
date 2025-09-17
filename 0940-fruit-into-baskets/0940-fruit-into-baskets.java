class Solution {
    public int totalFruit(int[] nums) {
        int k=2,ans=0,l=0,temp=0;
          HashMap<Integer,Integer> hr=new HashMap<>();
          for(int r=0;r<nums.length;r++){
              temp=nums[r];
                  hr.put(temp,hr.getOrDefault(temp,0)+1);
              while(hr.size()>k){
                  int val=nums[l];
                  hr.put(val,hr.get(val)-1);
                  if(hr.get(val)==0){
                      hr.remove(val);
                  }
                    l++;
              }
              ans=Math.max(ans,r-l+1);
              }
              return ans;
    }
}