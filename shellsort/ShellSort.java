package shellsort;
/**
 * 希尔排序
 * @author MA
 *
 */

public class ShellSort {
  public static void shellSort(int[] arr){
	  if(arr == null || arr.length < 1){
		  return;
	  }
	  int i,j,r,temp;
	  for(r=arr.length/2;r>=1;r=r/2){
		  for(i=r;i<arr.length;i++){
			  j = i - r;
			  temp = arr[i];
			  
			  while(j>=0 && arr[i] < arr[j]){
				  arr[j+r] = arr[j];
				  j=j-r;
			  }
			  arr[j+r] = temp;
		  }
	  }
	  
  }
  
  public static void main(String[] args) {
	int[] arr = {6,9,5,3,8,7,4,2,1,10};
	shellSort(arr);
	for(int i:arr){
		System.out.print(i + "  ");
	}
}
}
