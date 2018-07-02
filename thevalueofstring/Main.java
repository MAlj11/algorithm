package thevalueofstring;

import java.util.Scanner;

/**
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。 
 * @author MA
 *
 */
public class Main {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int[] freq = new int[26];
		    int i, k, s=0;
		    String input = sc.nextLine();
		    k = sc.nextInt();
		    for (i=0; i<input.length(); ++i)
		      freq[(int)(input.charAt(i)-'a')]++;
		    while (k-- != 0) {
		      i = maxElement(freq);
		      freq[i]--;
		    }
		    for (i=0; i<26; ++i)
		      s += freq[i]*freq[i];
		    System.out.println(s);
		  }
		  private static int maxElement(int[] array) {
		    int i, maxIndex=0;
		    for (i=1; i<array.length; ++i)
		      maxIndex = array[i]>array[maxIndex] ? i : maxIndex;
		    return maxIndex;
		  }
}
