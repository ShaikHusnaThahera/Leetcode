class Solution {
    public int hammingDistance(int x, int y) {
    String s="";
    int n=x^y;
    while(n!=0){
        if(n%2 == 1){
            s+='1';
        }
        else{
            s+='0';
        }
        n=n/2;
    }
    int count=0;
    for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='1'){
        count+=1;
    }
    else{
        count+=0;
    }
    }
    return count;
    }
}