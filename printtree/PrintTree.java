package printtree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * @author MA
 *
 */

public class PrintTree {
	static class BinaryNode {
		int var;
		BinaryNode left;
		BinaryNode right;

		public BinaryNode(int var,BinaryNode left,BinaryNode right) {
			this.var = var;
			this.left = left;
			this.right = right;
		}
	}

	public void printTree(BinaryNode root) {
		if (root == null) {
			System.out.println("无节点");
		}

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {

			BinaryNode a = queue.poll();
			System.out.println(a.var + "  ");
			if (a.left != null) {
				queue.offer(a.left);
			}
			if (a.right != null) {
				queue.offer(a.right);
			}

		}

	}

	public static void main(String[] args) {
	BinaryNode node1=new BinaryNode(5,null,null);
    BinaryNode node2=new BinaryNode(7,null,null);
    BinaryNode node3=new BinaryNode(9,null,null);
    BinaryNode node4=new BinaryNode(11,null,null);
    BinaryNode node5=new BinaryNode(6,node1,node2);
    BinaryNode node6=new BinaryNode(10,node3,node4);
    BinaryNode node7=new BinaryNode(8,node5,node6);
    PrintTree pt = new PrintTree();
    pt.printTree(node7);
    
	}

}
