package reConstructBinarytree;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * @author MA
 * 
 */
/*
 * 二叉树前序遍历：根、左、右 中序遍历：左、根、右 后序遍历：左、右、根 记忆方法：根节点顺序
 */

class BinaryTreeNode {
	int root;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int root) {
		this.root = root;
	}

}

public class reConstructBinaryTree {
	public static BinaryTreeNode ConstructBinaryTree(int[] pre, int[] in) { // 创建存放根节点和子节点的类
		if (pre == null || in == null) { // 判断是否为空值
			return null;
		}
		BinaryTreeNode root = reConstructBinaryTree.reBuiltTree(pre, 0, // 调用构建方法
				pre.length - 1, in, 0, in.length - 1);

		return root;

	}

	private static BinaryTreeNode reBuiltTree(int[] pre, int startpre,
			int endpre, int[] in, int startin, int endin) {
		if (startpre >= endpre || startin >= endin) {                       //判空
			return null;
		}
		int root = pre[startpre];                                           //前序遍历的第一个就是根节点
		BinaryTreeNode treeroot = new BinaryTreeNode(root);                 //存入根节点

		int iroot = indexOf(in, startin, endin, pre[startpre]);             //找到根节点在中序遍历中的位置，该位置的左边为左子叶，右边为右子叶

		treeroot.left = reBuiltTree(pre, startpre + 1, startpre + iroot    //递归，分别找出各节点
				- startin, in, startin, iroot);
		treeroot.right = reBuiltTree(pre, startpre + iroot - startin + 1,
				endin, in, iroot + 1, endin);

		return treeroot;

	}

	public static int indexOf(int[] arr, int start, int end, int value) {  //查找中序遍历索引
		int index = -1;
		for (int i = start; i <= end; i++) {
			if (arr[i] == value) {
				index = i;
			}
		}
		return index;
	}
}
