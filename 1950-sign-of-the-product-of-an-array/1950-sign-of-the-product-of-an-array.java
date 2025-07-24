class Solution {
    public int arraySign(int[] nums) {
        int negcnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            return 0;
            if(nums[i]<0)
            negcnt++;
        }

        
        return (negcnt%2==0)?1:-1;
    }
}