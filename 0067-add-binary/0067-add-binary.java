import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // StringBuilder res = new StringBuilder();
        // int i = a.length() - 1;
        // int j = b.length() - 1;
        // int carry = 0;
        // while(i >= 0 || j >= 0){
        //     int sum = carry;
        //     if(i >= 0) sum += a.charAt(i--) - '0';
        //     if(j >= 0) sum += b.charAt(j--) - '0';
        //     carry = sum > 1 ? 1 : 0;
        //     res.append(sum % 2);
        // }
        // if(carry != 0) res.append(carry);
        // return res.reverse().toString();
        BigInteger num1=new BigInteger(a,2);
        BigInteger num2=new BigInteger(b,2);
        BigInteger sum=num1.add(num2);
        return sum.toString(2);
    }
}