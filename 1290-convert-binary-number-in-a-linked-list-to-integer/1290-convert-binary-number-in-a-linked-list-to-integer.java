/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String ans="";
        ListNode temp=head;
        // if(temp.val==1)return 1 ;
        // if(temp.val==0) return 0;
        while(temp !=null){
            ans+=temp.val;
            temp=temp.next;
        }
        // System.out.print(ans);
        int i = 0;
        int decimal = 0;
        while (i<ans.length()) {
            decimal=decimal * 2 + (ans.charAt(i) - '0');
            i++;
            }
        return decimal;
   }
}