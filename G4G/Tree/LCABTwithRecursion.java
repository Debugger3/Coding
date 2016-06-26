/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    //TreeNode result;
    //boolean node1,nod2;
    public TreeNode traverseTree(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root==null)
            return null;
        if(root==p || root==q)    
            return root;
        TreeNode leftNode=traverseTree(root.left,p,q);
        TreeNode rightNode=traverseTree(root.right,p,q);
        if(leftNode!=null && rightNode!=null)        
            return root;
        if(leftNode!=null)    
            return leftNode;
        else if(rightNode!=null)    
            return rightNode;    
        return null;    
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        return traverseTree(root,p,q);    
        
    }
}
