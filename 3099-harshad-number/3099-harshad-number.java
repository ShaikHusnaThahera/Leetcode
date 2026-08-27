class Solution {
    public static int harshadnum(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int res=harshadnum(x);
        return (x%res==0)?res:-1;
    }
}