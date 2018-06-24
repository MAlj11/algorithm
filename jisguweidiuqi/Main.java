package jisguweidiuqi;

import java.util.ArrayList;
import java.util.List;

/**
 * 对于一个由0..n的所有数按升序组成的序列，我们要进行一些筛选，每次我们取当前所有数字中从小到大的第奇数位个的数，
 * 并将其丢弃。重复这一过程直到最后剩下一个数。请求出最后剩下的数字。
 * 
 * @author MA
 *
 *
 */

public class Main {
	public static int deleteOdd(int n) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		while (list.size() > 1) {
			int num = 0;
			for (int i = 1; i <= n; i = i + 2) {
				if (i < list.size()) {
					list.set(i, n + 1);
					num++;
				}
			}
			/*for(int i : list){
				System.out.println(i+" ");
			}*/
			for (int m = 0; m < list.size(); m++) {
				
				if (list.get(m) == n+1) {
					list.remove(m);
				}
			}
			n = n - num;
		}
		return list.get(0);

	}

	public static void main(String[] args) {
		System.out.println(deleteOdd(500));
	}
}
