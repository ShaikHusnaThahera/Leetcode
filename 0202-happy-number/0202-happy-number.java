class Solution {
    public static int sums(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int s=sums(n);
        while(s!=1&&s!=4){
           s=sums(s);
        }
        return s==1;
    }
}