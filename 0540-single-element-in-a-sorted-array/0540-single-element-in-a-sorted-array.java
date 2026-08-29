class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> hr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hr.put(nums[i],hr.getOrDefault(nums[i],0)+1);
        }
        int res=0;
        for(int n:hr.keySet()){
            if(hr.get(n)==1){
                res=n;
            }
        }
        return res;
    }
}