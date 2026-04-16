class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hr=new HashMap<>();
        ArrayList<Integer> ha=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            hr.put(n,hr.getOrDefault(n,0)+1);
            if (!ha.contains(n)) {
                ha.add(n);
            }
        }
        Collections.sort(ha, (a, b) -> hr.get(b) - hr.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ha.get(i);
        }
        return result;
    }
}