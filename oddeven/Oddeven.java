package oddeven;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * @author MA
 *
 */

public class Oddeven {
	/*
	 * 思路：运用快排的思路，两个位置，从最前面和最后面开始找
	 * 前面的找到偶数的时候停下  后面的找到奇数的时候停下
	 * 交换位置   直到两个相遇
	 */
	
	public void oddEven(int[] arr){
		if(arr.length == 0 || arr == null){
			return;
		}
		int left = 0;
		int right = arr.length - 1;
		while(right >= left){
			if((arr[right]&1) != 1 && right > 0){
				  right--;
			}
			if((arr[left]&1) != 0 && left < arr.length){
				left++;
			}
			
			if((arr[right]&1)==1&&(arr[left]&1)==0){
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;			
				}
		}
		for(int a:arr){
			System.out.print(a + "  ");
		}
	}
	public static void main(String[] args) {
		Oddeven oe = new Oddeven();
		int[] arr = {1,5,6,8,3,4,2,7,9};
		oe.oddEven(arr);
	}

}
