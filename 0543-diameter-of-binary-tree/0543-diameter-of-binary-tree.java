/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   static int dia=0;
    public static int isdepth(TreeNode root){
        if(root==null) return 0;
        int ld=isdepth(root.left);
        int rd=isdepth(root.right);
         dia=Math.max(ld+rd,dia);
         return 1+Math.max(ld,rd);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dia=0;
        isdepth(root);
        return dia;
    }
}