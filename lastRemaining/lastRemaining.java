package lastRemaining;
/**
 * 0，1，，，，，n-1这n 个数字排成一个圆圈，从数字0开始每次从这个圆圈中删除第m个数字。求出这个圆圈里剩下的最后一个数字.
 */
import java.util.LinkedList;
import java.util.List;

public class lastRemaining {
	public static void lastRemaining1(int num, int index) {
		if (num < 1 || index < 1) {
			return;
		}

		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < num; i++) {
			list.add(i);
		}

		int k = 0;
		while (list.size() > 0) {
			k = k + index;
			k = k % (list.size()) - 1;
			if (k < 0) {
				System.out.println(list.get(list.size() - 1));
				list.remove(list.size() - 1);
				k = 0;
			} else {
				list.remove(k);
			}
		}

	}
 public static int lastRemaining2(int n,int m){  
     if(n<1||m<1) return -1;  
     int last=0;  
     for(int i=2;i<=n;i++)  
         last=(last+m)%i;  
     return last;  
 } 
 public static void main(String[] args) {
	lastRemaining2(5,3);
}
}
