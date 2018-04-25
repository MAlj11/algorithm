package fibonacci;

/**
 * 斐波那契数列思想
 * 
 * @author MA
 * 
 */

public class Fibonacci {
	/*
	 * f= 0 x=0 1 x=1 f(x-1)+f(x-1) x>2
	 * 
	 * 思路：可以递归实现，也可以循环实现 递归会有数据循环交叠的情况，效率会大大减少 可用循环
	 */

	// 递归实现
	public static int recursive(int x) {
		if (x == 0) {
			return 0;
		}
		if (x == 1) {
			return 1;
		}
		return recursive(x - 1) + recursive(x - 2);
	}

	// 循环实现
	public static int fobFor(int x) {
		int[] result = { 0, 1 };
		if (x < 2) {
			return result[x];
		}

		int one = 1;
		int twe = 0;
		int mid = 0;
		for (int i = 2; i <= x; i++) {       //大于2后，开始循环，由底向上寻找
            mid = one + twe;                 //设定一个中间值，往里存每次两个数相加的数
			twe = one;                       //关系  ：x=   2    3     4     5      6
			one = mid;                       //          1  0 2  1  3  2  4  3   5  4
		}
		return mid;

	}

	
	public static void main(String[] args) {
		System.out.println(Fibonacci.recursive(10));
		System.out.println(Fibonacci.fobFor(10));
	}
}
