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
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int max=Integer.MIN_VALUE,level=1,levelsum=0,anslevel=1;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode cnode=queue.poll();
                levelsum+=cnode.val;
                if(cnode.left!=null)queue.offer(cnode.left);
                if(cnode.right!=null)queue.offer(cnode.right);
            }
            if(levelsum>max){
                max=levelsum;
                anslevel=level;
            }
            level++;
            levelsum=0;
        }
        return anslevel;
    }
}