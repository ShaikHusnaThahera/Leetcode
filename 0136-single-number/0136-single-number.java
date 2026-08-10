class Solution {
    public int singleNumber(int[] nums) {
        // int n=0;
        // HashMap<Integer,Integer> hr=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     n=nums[i];
        //     hr.put(n,hr.getOrDefault(n,0)+1);
        // }
        // for(int h:hr.keySet()){
        // if(hr.get(h)==1)
        //       return h;
        // }
        // return 1;
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}