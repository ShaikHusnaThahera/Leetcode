class Solution
 {
    public int climbStairs(int n)
     {
        if(n==1 || n==2)
            return n;
            int n1=1;
            int n2=2;
            int next=0;
            for(int i=3;i<=n;i++)
            {
                next=n1+n2;
                n1=n2;
                n2=next;
            }
            return next;
            
        }
    }
