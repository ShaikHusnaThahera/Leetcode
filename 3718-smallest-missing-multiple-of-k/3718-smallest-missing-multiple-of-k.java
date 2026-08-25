class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hr.contains(nums[i]))
            hr.add(nums[i]);
        }
        int m=k;
        while(hr.contains(m)){
            m+=k;
        }
        return m;
    }
}