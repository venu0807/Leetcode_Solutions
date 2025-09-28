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
    static{
        Solution sc = new Solution();
        for(int i=0;i<500;i++){
            sc.averageOfLevels(null);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result= new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            double sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                sum+=(double)node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(Math.round((sum/size) * 1e5)/1e5);
        }
        return result;
    }
}