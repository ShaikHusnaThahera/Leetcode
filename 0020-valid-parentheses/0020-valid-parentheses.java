class Solution {
    public boolean isValid(String s) {
        Stack<Character> hr=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                hr.push(s.charAt(i));
            }
            else if(hr.isEmpty()){
                return false;
            }
            else if(s.charAt(i)==')' && hr.peek()=='(' || s.charAt(i)=='}' && hr.peek()=='{' || s.charAt(i)==']' && hr.peek()=='['){
                hr.pop();
            }
            else{
                return false;
            }
        }
        return hr.size()==0;
    }
}