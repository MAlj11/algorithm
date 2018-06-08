package insertionsort;

/**
 * 插入排序
 * 
 * @author MA
 *
 */
public class InsertionSort {
	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 1) {
			return;
		}
		int temp;
		for (int i = 1; i < arr.length; i++) {     //控制数字比较的次数
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {        //当前数分别与会之前的数做比较
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 3, 6, 4, 8, 2, 5, 7, 1 };
		insertionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
