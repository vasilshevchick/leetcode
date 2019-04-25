package steps.step1.tree;

public class ValidateBinarySearchTree {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(7);
    ValidateBinarySearchTree tree = new ValidateBinarySearchTree();
    System.out.println(tree.isValidBST(root));
  }

  public boolean isBSTHelper(TreeNode node, Integer lower_limit, Integer upper_limit) {

    if (lower_limit != null && node.val <= lower_limit) {
      return false;
    }
    if (upper_limit != null && node.val >= upper_limit) {
      return false;
    }
    boolean left = node.left == null || isBSTHelper(node.left, lower_limit, node.val);
    if (left) {
      return node.right == null || isBSTHelper(node.right, node.val, upper_limit);
    } else {
      return false;
    }
  }

  public boolean isValidBST(TreeNode root) {
    if (root == null) { return true; }

    return isBSTHelper(root, null, null);
  }
}
