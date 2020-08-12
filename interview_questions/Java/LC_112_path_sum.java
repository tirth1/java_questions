/*

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

*/



class Solution {
    Set<Integer> set = new HashSet<Integer>();
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) {
            return false;
        }
        pathSum(root,0);
        return set.contains(sum);   
    }
    
    void pathSum(TreeNode root, int sum) {
        
        if(root.left==null && root.right==null) {
            set.add(sum+root.val);
            return;
        }
        if(root.left!=null) pathSum(root.left, sum+root.val);
        if(root.right!=null) pathSum(root.right, sum+root.val);
        
    }
}