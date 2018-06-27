package xunhuanshubijiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
  牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。 
 * @author MA
 *
 *输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
 *输出：如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
 */
public class Main {
	public static void compareInt(String str) {
		List<Integer> nullindex = new ArrayList<Integer>();
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				nullindex.add(i);
				// System.out.print(i+" ");
			}
		}

		String str1 = str.substring(0, nullindex.get(0));
		String str2 = str.substring(nullindex.get(0) + 1, nullindex.get(1));
		String str3 = str.substring(nullindex.get(1) + 1, nullindex.get(2));
		String str4 = str.substring(nullindex.get(2) + 1);

		int times1 = Integer.parseInt(str2);
		int times2 = Integer.parseInt(str4);

		for (int i = 0; i < times1; i++) {
			sb1.append(str1);

		}
		for (int i = 0; i < times2; i++) {
			sb2.append(str3);

		}

		long num1 = Long.parseLong(sb1.toString());
		long num2 = Long.parseLong(sb2.toString());
		long target = num1 - num2;

		if (target < 0) {
			System.out.println("Less");
		} else if (target == 0) {
			System.out.println("Equals");
		} else {
			System.out.println("Greater");
		}
		// System.out.println("str1="+str1 + " "+"str2=" + str2+"  "+"str3="
		// +str3+ " " +"str4="+ str4);

	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		  //java.io.InputStreamReader继承了Reader类
		  String str = null;
		  try {
		   str = br.readLine();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  compareInt(str);
	}
}
