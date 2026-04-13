class Solution {
    public static int sums(int n){
        int s=0;
        while(n>0){
            int digit=n%10;
            s+=digit*digit;
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int s=sums(n);
        // System.out.println(s);
        while(s!=1 && s!=4){
               s=sums(s);
        }
        return s==1;
    }
}