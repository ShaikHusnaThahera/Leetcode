class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> hr=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= val){
            hr.add(nums[i]);
        }
        }
    for(int i=0;i<hr.size();i++){
        nums[i]=hr.get(i);
       }
    return hr.size();
}
}