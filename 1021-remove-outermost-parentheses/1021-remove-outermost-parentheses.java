class Solution {
    public String removeOuterParentheses(String s) {
        int balance=0;
        StringBuilder hr=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(balance>0){
                    hr.append(s.charAt(i));
                }
                balance++;
            }
            else if(s.charAt(i)==')'){
                balance--;
                if(balance>0){
                    hr.append(s.charAt(i));
                }
            }
        }
        return hr.toString();
    }
}