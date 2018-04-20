/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
