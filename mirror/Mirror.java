package mirror;
/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * @author MA
 *
 */

public class Mirror {
	/*
	 * 思路：递归依次交换节点的左右子节点
	 */
	public class BinarytreeNode{
		int root;
		BinarytreeNode left;
		BinarytreeNode right;
		
		public BinarytreeNode(int root){
			this.root = root;
		}
		
	}
	
	
	public void mirror(BinarytreeNode root){
		if(root == null){             //判空
			return;
		}
		
		BinarytreeNode temp = root.left;     //如果不为空  则使该节点的左右子节点交换
		root.left = root.right;           
		root.left = temp;
		
		if(root.left != null){               //判断是否有左右子节点     
			mirror(root.left);               //如果有，则进行递归   继续交换左右子节点
		}
		if(root.right != null){
			mirror(root.right);
		}
	}

}
