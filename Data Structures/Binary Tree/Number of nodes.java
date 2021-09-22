class Solution {
    public int count(TreeNode root) {
        if(root == null) return 0;
        return count(root.left) + count(root.right) + 1;
    }
}
