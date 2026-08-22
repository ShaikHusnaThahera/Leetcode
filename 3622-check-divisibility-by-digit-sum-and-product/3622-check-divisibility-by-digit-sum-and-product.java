class Solution {
    public static int sumofn(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        return sum;
    }
    public static int proofn(int n){
        int pro=1;
        while(n>0){
            int dig=n%10;
            pro=pro*dig;
            n=n/10;
        }
        return pro;
    }
    public boolean checkDivisibility(int n) {
        int sum=sumofn(n);
        int pro=proofn(n);
        if(n%(sum+pro)==0)return true;
        else return false;
    }
}