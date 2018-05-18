package printmatrix;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数
     字，例如，如果输入如下矩阵：
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10. 
 * @author MA
 *
 */
public class PrintMartix {
	/*
	 * 思路：一圈一圈的循环打印出这个矩阵，先把要循环的	圈数确定下来
	 * 当二位数组是4*4时最后一圈左上角的坐标为（1,1）
	 *           5*5                                         （2,2）
	 *           6*6                                         （2,2）
	 *           7*7                                         （3,3）
	 *  所以最后一圈的左上角的坐标 一定满足这个条件  
	 *    row>x*2     column>y*2  
	 */

	public static void printMartix(int[][] numbers){
		if(numbers == null){
			System.out.println("数组有错");
			return;
		}
		int row = numbers.length;
		int column = numbers[0].length;
		
		if(row<1 || column<1){
			System.out.println("数组不是矩阵");
			return;
		}
		int start = 0;
		//确定循环圈数范围
		while(row > start*2 && column > start*2){
			printRowandcolumn(numbers,row,column,start);
			start++;
		}
	}
         //逐行逐列打印
	private static void printRowandcolumn(int[][] numbers, int row, int column,int start) {
	     int x = row - 1 - start;  //确定当时圈的行数列数
	     int y = column -1 - start;
	     
	     //从左往右打印第一行
	     for(int i=start;i<y;i++){
	    	 int num = numbers[start][i];
	    	 System.out.print(num + ",");
	     }
		
	     //从上往下打印最右边的一列
	     for(int i=start;i<x;i++){
	    	 int num = numbers[i][y];
	    	 System.out.print(num + ",");
	    	 
	     }
	     
	     //从右往左打印最下面的一行
	     for(int i=y;i>=start;i--){
	    	 int num = numbers[x][i];
	    	 System.out.print(num + ",");
	     }
	     
	     //从下往上打印最左边的一列
	     for(int i=x-1;i>=start+1;i--){
	    	 int num = numbers[i][start];
	    	 System.out.print(num + ",");
	     }
	}
	
       public static void main(String[] args) {
   		int[][] numbers = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
   		printMartix(numbers);
       }
}
