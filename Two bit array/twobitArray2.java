
public class twobitArray2 {

	public static boolean lookupNum(int[][] arr,int targetNum){
		
		if(arr == null){
			return false;
		}
		int row=0;
		int column = arr[row].length-1;
        boolean flag = false;		
		while(row<arr.length&&column>=0){
			if(arr[row][column] == targetNum){
				flag = true; 
			}
			
			if(arr[row][column]>targetNum){
				row++;
			}else{
				column--;
			}
		}
		return flag;
}
	
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean f = twobitArray.lookupNum(arr, 3);
		System.out.println(f);
	}
}