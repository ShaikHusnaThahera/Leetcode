class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hr.put(nums[i],1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hr.containsKey(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}