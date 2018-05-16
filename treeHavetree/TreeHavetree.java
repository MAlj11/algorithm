package treeHavetree;

/**
 * 输入两棵二叉树A和B，判断B是不是A的子结构
 * 
 * @author MA
 * 
 */
public class TreeHavetree {
	/*
	 * 思路：判断是不是子结构，首先判断根节点是不是一样，如果一样在判断左右节点，都一样了就是子结构了
	 */

	class BinaryTreeNode {
		int value;
		BinaryTreeNode leftNode = null;
		BinaryTreeNode rightNode = null;

		public BinaryTreeNode(int value) {
			this.value = value;
		}
	}

	public static boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		boolean result = false;
		if (root1 == null) {
			return false;
		}
		if (root2 == null) {
			return true;
		}

		if (root1 != null && root2 != null) {
			if (root1.value == root2.value) { // 判断有没有一样的根节点
				result = tree1haveTree2(root1, root2); // 如果有则进行子结构判断，并接收返回值，如果不一样
														// 则继续判断下一节点
			}
			if (!result) {
				hasSubTree(root1.leftNode, root2);
			}
			if (!result) {
				hasSubTree(root1.rightNode, root2);
			}
		}
		return result;
	}

	public static boolean tree1haveTree2(BinaryTreeNode root1,
			BinaryTreeNode root2) { // 判断树的子结构
		if (root1 == null) {
			return false;
		}
		if (root2 == null) {
			return true;
		}
		if (root1.value != root2.value) {
			return false;
		}

		return tree1haveTree2(root1.leftNode, root2.leftNode)
				&& tree1haveTree2(root1.rightNode, root2.rightNode);
		// 判断树的子结构是否一致
	}

}
