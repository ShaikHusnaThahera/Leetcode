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
    public static void func(List<Integer> res,TreeNode cur,int curd){
        if(cur==null){
            return;
        }
        if(curd==res.size()){
            res.add(cur.val);
        }
        func(res,cur.right,curd+1);
        func(res,cur.left,curd+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> hr=new ArrayList<>();
        func(hr,root,0);
        return hr;
    }
}