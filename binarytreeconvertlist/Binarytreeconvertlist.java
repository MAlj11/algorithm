package binarytreeconvertlist;
/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 * @author MA
 *
 */
public class Binarytreeconvertlist {
/*
 * 思路：将树分为三部分：左子树，根结点，右子树。
1.我们要把根结点与左子树的最大结点连接起来
2.要把根结点与右子树的最小结点连接起来
 */
	
	public static class BinarytreeNode{
		int value;
		BinarytreeNode left;
		BinarytreeNode right;
		public BinarytreeNode(int value){
			this.value = value;
		}
	}
	
	
	
	public static BinarytreeNode convert(BinarytreeNode root){
	   BinarytreeNode node = null;
	   baseconvert(root,node);
		while(node != null && node.left != null){
			node = node.left;
		}
		return node;
	}



	public static void baseconvert(BinarytreeNode root, BinarytreeNode LastNode) {
		if(root == null){
			return;
		}
		BinarytreeNode current = root;
		if(current.left != null){
			baseconvert(current.left,LastNode);
		}
		current.left = LastNode;
		if(LastNode != null){
			LastNode.right = current;
		}
		if(current.right != null){
			baseconvert(current.right,LastNode);
			}
	}
}
