package zuidachazhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。给定数组A及它的大小n，请返回最大差值。
 * @author MA
 *输入【10，5】 2
 *输出 0
 */
public class Main {
	public static int maxSub(int[] A,int n){
		List<Integer> list = new ArrayList<Integer>();
		int num = 0;
		for(int i=n-1;i>=0;i--){
			for(int j=i;j>=0;j--){
				num = A[i] - A[j];
				list.add(num);
			}
		}
		Collections.sort(list);
		return list.get(list.size()-1);
				
	}
	public static void main(String[] args) {
		int[] A = {10,5};
		System.out.println(maxSub(A,2));
	}

}
