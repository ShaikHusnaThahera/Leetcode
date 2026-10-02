class Solution {
    public int climbStairs(int n) {
        int n1=0;
        int n2=1;
        int count=0;
        while(n>0){
            count=n1+n2;
            n1=n2;
            n2=count;
            n--;
        }
        return count;
    }
}