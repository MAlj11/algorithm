package isbinarytreenode;
/**
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true，否则返回false。假设输入的数组的任意两个数字都互不相同。
 * 
 * 例如输入数组｛5，7，6，9，11，10，8｝则返回true，因为这个整数序列是下图
 * 二叉树的后序遍历的结果。如果输入的数组是｛7，4，6，5｝，由于没有哪颗二叉
 * 搜索树的后续遍历的结果是这个序列，因此返回false。
 * @author MA
 *
 */

public class IsBianryTreeNode {

	/*
	 * 思路：二叉搜索树：左节点均小于根节点，右节点均大于根节点
	 * 
	 * 后序遍历，最后一个节点肯定是整个树的根节点，如果第一的数小于最后一个
	 * 则这个点为左树的节点，直到有大于的时候则为有节点
	 * 递归实现所有节点
	 */
	
	public static boolean isBinarytreeNode(int[] arr,int start,int end){
		if(arr == null || end<=0 || start<0){
			System.out.println(start + "  " + end);
			return false;
		}
		
		
	    int root = arr[end];
        System.out.println(root);
      
     
        int i = start;
        for(;i<=end-1;i++){
        	if(arr[i] > root){
        		break;
        	}
        }
        
        for(int j=i;j<=end;j++){
        	if(arr[j] < root){
        		return false;
        	}
        }
        boolean isleft = true;
        if(i>start){
        	isleft = isBinarytreeNode(arr,start,i-1);
        }
        boolean isright = true;
        if(i<end-1){
        	isright = isBinarytreeNode(arr,i,end-1);
        }
        
        return (isleft && isright);
	}
	
	public static void main(String[] args) {
		int[] arr={5,7,6,9,11,10,8}; 
		System.out.println(isBinarytreeNode(arr, 0, arr.length-1));
	}
}
