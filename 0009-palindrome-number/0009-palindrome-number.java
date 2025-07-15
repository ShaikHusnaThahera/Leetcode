class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int sum=0;
        int temp=x;
        boolean res=false;
        while(x > 0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
            }
       if(temp == sum){
        res= true;
       }
       else{
        res=false;
       }
       return res;
    }
}