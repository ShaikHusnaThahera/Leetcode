class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> hr=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(hr.isEmpty()){
            hr.push(s.charAt(i));
            }
            else{
            if(s.charAt(i)==hr.peek()){
                hr.pop();
            }
            else{
            hr.push(s.charAt(i));
            }
            }
        }
        while(!hr.isEmpty()){
            ans+=hr.pop();
        }
        String reversed = new StringBuilder(ans).reverse().toString();
        return reversed;
    }
}