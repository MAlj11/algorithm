/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * 
 * @author MA
 * 
 */

// The method is bad..
public class twobitArray {
	public static boolean lookupNum(int[][] arr, int targetNum) {
	
		boolean flag = false;
		if (arr == null) {
			return false;
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j] == targetNum){
					flag=true;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean f = twobitArray.lookupNum(arr, 55);
		System.out.println(f);
	}
}
