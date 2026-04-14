class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        int k=0;
        HashMap<Integer,Integer> hr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            hr.put(n,hr.getOrDefault(n,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hr.get(nums[i])==1){
              arr[k++]=nums[i];
            }
        }
        return arr;
    }
}