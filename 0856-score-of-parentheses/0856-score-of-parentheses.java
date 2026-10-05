class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> hr=new Stack<>();
        hr.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                hr.push(0);
            }
            else{
                int inside=hr.pop();
                int score=0;
                if(inside==0){
                    score=1;
                }
                else{
                    score=2*inside;
                }
                hr.push(hr.pop()+score);
            }
        }
        return hr.pop();
    }
}