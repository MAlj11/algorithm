package findpath;

import java.util.Stack;

/**
 * 输入一课二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author MA
 *
 */

public class FindPath {
	
	static class BinarytreeNode{
		int value;
		BinarytreeNode left;
		BinarytreeNode right;
		public BinarytreeNode(int value){
			this.value = value;
		}
	}
		
		public static void findPath(BinarytreeNode root,int a){
			if(root == null){
				System.out.println("����Ϊ��");
				return;
			}
			int sum = 0;
			Stack<Integer> stack = new Stack<Integer>();
			findPath2(root,a,stack,sum);
			}
		
		public static void findPath2(BinarytreeNode root,int a,Stack<Integer> stack,int sum){
			if(root == null){
				return;
			}
			sum = sum + root.value;
			stack.push(root.value);
			if(root.left == null && root.right == null){
				if(sum == a){
					System.out.print("找到一条路径：  ");
					for(int b:stack){
						System.out.print(b+"  ");
					}
				}
				
			}else{
				if(root.left != null){
					findPath2(root.left,a,stack,sum);
				}
				if(root.right != null){
					findPath2(root.right,a,stack,sum);
				}
			}
			stack.pop();
		}
	

	public static void main(String[] args) {
		BinarytreeNode r1 = new BinarytreeNode(10);
		BinarytreeNode r2 = new BinarytreeNode(5);
		BinarytreeNode r3 = new BinarytreeNode(12);
		BinarytreeNode r4 = new BinarytreeNode(4);
		BinarytreeNode r5 = new BinarytreeNode(7);
		r1.left = r2;
		r1.right = r3;
		r2.left = r4;
		r2.right = r5;
		
		findPath(r1,22);
	}

	
}
