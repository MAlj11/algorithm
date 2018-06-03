package treedepth;

/**
 * 输入一颗二叉树的根结点，求该树的深度。 从根结点到叶结点依次经过的结点（含根，叶子结点）形成一条路径，最长路径的长度为树的深度。
 * 
 * @author MA
 *
 */
public class TreeDepth {

	public static class BinaryTreeNode {
		int var;
		BinaryTreeNode left;
		BinaryTreeNode right;

		public BinaryTreeNode(int var) {
			this.var = var;
		}
	}

	public static int treeDepth(BinaryTreeNode root) {
		if (root == null) {
			System.out.println("trss is empty");
		}
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);

		int result = (left > right) ? left : right;
		return (result + 1);
	}
}
