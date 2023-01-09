class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null){
            return Collections.<Integer>emptyList();
        }
        
        arr.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return arr;
    }
}
