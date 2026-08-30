class Solution {
    public static int proo(int n){
         int pro=1;
        while(n>0){
            int dig=n%10;
            pro=pro*dig;
            n=n/10;
        }
        return pro;
    }
    public static int summ(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        return sum;
    }
    public int subtractProductAndSum(int n) {
       return proo(n)-summ(n);
    }
}