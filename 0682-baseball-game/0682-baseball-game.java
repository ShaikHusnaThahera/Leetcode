class Solution {
    public int calPoints(String[] operations) {
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<operations.length;i++){
        String ch=operations[i];
            if(ch.equals("C")){
            st.pop();
            }     
            else if(ch.equals("D")){
                int ans=st.peek();
                ans=ans*2;
                st.push(ans);
            }
            else if(ch.equals("+")){
              int to=st.pop();
                 int to1=st.peek();
                 st.push(to);
                 st.push(to+to1);
            }
            else{
                st.push(Integer.valueOf(ch));
            }
        }
        int res=0;
        for(int a:st){
            res+=a;
        }
        return res;
    }
}