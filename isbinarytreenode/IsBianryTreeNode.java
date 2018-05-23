package isbinarytreenode;
/**
 * ��Ŀ������һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ������򷵻�true�����򷵻�false���������������������������ֶ�������ͬ��
 * 
 * �������������5��7��6��9��11��10��8���򷵻�true����Ϊ���������������ͼ
 * �������ĺ�������Ľ�����������������ǣ�7��4��6��5��������û���ĿŶ���
 * �������ĺ��������Ľ����������У���˷���false��
 * @author MA
 *
 */

public class IsBianryTreeNode {

	/*
	 * ˼·����������������ڵ��С�ڸ��ڵ㣬�ҽڵ�����ڸ��ڵ�
	 * 
	 * ������������һ���ڵ�϶����������ĸ��ڵ㣬�����һ����С�����һ��
	 * �������Ϊ�����Ľڵ㣬ֱ���д��ڵ�ʱ����Ϊ�нڵ�
	 * �ݹ�ʵ�����нڵ�
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
