package printer;

/**
 * 有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。 给定一个二位数组arr及题目中的参数n，请返回结果数组。
 * 
 * @author MA
 *
 */

public class Printer {
	public static int[] arrayPrint(int[][] arr, int n) {
		/*
		 * 1 2 3 4
		 * 
		 * 5 6 7 8
		 * 
		 * 9 10 11 12
		 * 
		 * 13 14 15 16
		 * 
		 * 
		 * (0,3) (0,2)(1,3) (0,1)(1,2)(2,3) (0,0)(1,1)(2.2)(3,3) 
		 * (1,0)(2,1)(3,2) (2,0)(3,1) (3,0)
		 * 
		 
		 */
		int[] result = new int[n * n];
		int index = 0;
		for (int i = n - 1; i >= 0; i--) {
			int x = 0;
			int y = i;
			while(x<n && y<n){
				result[index++] = arr[x][y];
				x++;
				y++;
			}
		}
		
		for(int i=1;i<n;i++){
			int x=i;
			int y=0;
			while(x<n && y<n){
				result[index++] = arr[x][y];
				x++;
				y++;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[] array = arrayPrint(arr,4);
		for(int i : array){
			System.out.print(i + "  ");
		}
	}
}
