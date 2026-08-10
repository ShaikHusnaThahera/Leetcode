class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> hr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hr.put(nums[i],hr.getOrDefault(nums[i],0)+1);
        }
        int xor=0;
        for(int num:hr.keySet()){
            if(hr.get(num)==2){
                xor=xor^num;
            }
        }
        return xor;
    }
}