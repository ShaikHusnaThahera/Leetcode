class Solution {
    public static void fun(String b,int open,int close,int n,ArrayList<String> hr){
         if(open==n && close==n){
            hr.add(b);
            return ;
        }
        if(open < n){
            fun(b+'(',open+1,close,n,hr);
        }
        if(close<open){
            fun(b+')',open,close+1,n,hr);
        }
    }
    public List<String> generateParenthesis(int n) {
        int open=0;
        ArrayList<String> hr=new ArrayList<>();
        int close=0;
        fun("",open,close,n,hr);
        return hr;
    }
}