package luckynumber;

import java.util.Scanner;

/**
 * f(x)表示把x这个数用十进制写出后各个数位上的数字之和。 如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位上的数字之和。
 * 如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 小明同学发现对于一些正整数x满足f(x)=g(x)，
 * 他把这种数称为幸运数，现在他想知道，大于0且小于等于n的幸运数有多少个？
 * 
 * @author MA
 *
 */
public class Main {

	// 十进制
	public static int f(int x) {
		int sum = 0;
		while (x > 0) {
			sum = x % 10;
			x = x / 10;
			// System.out.println(x);
		}
		return sum;
	}

	// 二进制
	public static int g(int x) {
		String binaryString = Integer.toBinaryString(x);
		int binaryInt = Integer.parseInt(binaryString);
		int sum2 = 0;
		while (binaryInt > 0) {
			if ((binaryInt & 1) == 1) {
				sum2++;
			}
			binaryInt = binaryInt >> 1;
		}
		return sum2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int luckynum = 0;
		for (int i = 1; i <= x; i++) {
			int sum1 = f(i);
			int sum2 = g(i);
			if (sum1 == sum2) {
				luckynum++;
			}
		}
		System.out.println(luckynum);
	}
}
