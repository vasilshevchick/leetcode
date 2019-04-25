package steps.step1.tree;

public class MaximumDepthofBinaryTree {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }
  }

//          3
//         / \
//        9  20
//          /  \
//         15   7

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    TreeNode right = new TreeNode(20);
    right.left = new TreeNode(15);
    right.right = new TreeNode(7);
    root.right = right;
    MaximumDepthofBinaryTree maximumDepthofBinaryTree = new MaximumDepthofBinaryTree();
    System.out.println(maximumDepthofBinaryTree.maxDepth(root));
  }

  public int maxDepth(TreeNode root) {
    if(root == null){
      return 0;
    }
    int leftDepth = 1 + maxDepth(root.left);
    int rightDepth = 1 + maxDepth(root.right);
    return leftDepth > rightDepth ? leftDepth : rightDepth;
  }
}
