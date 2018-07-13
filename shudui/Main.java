package shudui;

import java.util.Scanner;

/**
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。 但是牛牛记得老师告诉过他x和y均不大于n,
 * 并且x除以y的余数大于等于k。
 * 
 * 牛牛希望你能帮他计算一共有多少个可能的数对。
 * 
 * @author MA 输入包括两个正整数n,k(1 <= n <= 10^5, 0 <= k <= n - 1)。 对于每个测试用例,
 *         输出一个正整数表示可能的数对数量。
 *
 */
public class Main {

	public static int shudui(int n, int k) {
		int count = 0;
		int x = 0;
		int y = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				x = i;
				y = j;

				if (x <= n && y <= n) {
					if (x % y >= k) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int n = sc1.nextInt();
		int k = sc2.nextInt();

		int re = shudui(n, k);
		System.out.println(re);
	}
}
