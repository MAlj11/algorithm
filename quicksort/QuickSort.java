package quicksort;
/**
 * 快速排序
 * @author MA
 *
 */

public class QuickSort {
    public static void quickSort(int[] arr){
    	if(arr == null || arr.length == 1){
    		return;
    	}
    	quickSort(arr,0,arr.length-1);
    }
	public static void quickSort(int[] arr,int low,int high){
	    int temp;
		if(low > high){
			return;
		}
		//定左右起点
		int i = low;
		int j = high;
		//定参考值
		int key = arr[low];
		//一次排序
		while(i<j){
			while(j>i && arr[j]>key){
				j--;
			}
			while(i<j && arr[i]<key){
				i++;
			}
			if(i<j){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}
		
		//调整k的位置
	     temp = arr[i];
		arr[i] = key;
		key = temp;
		
		//递归左边
		quickSort(arr,low,i-1);
		//递归右边
		quickSort(arr,i+1,high);
	}
	public static void main(String[] args) {
		int arr[] = {9,8,6,2,4,7,5,3,1};
		quickSort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	
	
}
