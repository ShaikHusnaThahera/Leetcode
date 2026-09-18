class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[]=new int[nums1.length];
        Stack<Integer> hr=new Stack<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
        while(!hr.isEmpty() && hr.peek()<=nums2[i]){
            hr.pop();
        }
        if(hr.isEmpty()){
            map.put(nums2[i], -1);
        }
        else{
            map.put(nums2[i], hr.peek());
        }
        hr.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            nge[i] = map.get(nums1[i]);
        }
        return nge;
    }
}