package jinzhijunzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 一个数A如果按2到A-1进制表达时，各个位数之和的均值是多少
 * @author MA
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<x;i++){
			int sum = calc(x,i);
			list.add(sum);
		}
		int sum2 = 0;
		for(int i=0;i<list.size();i++){
			sum2 = sum2 + list.get(i);
		}
		System.out.println(sum2 + "/" + (x-2));
	}
	
	public static int calc(int num,int num2){
		int bit = num % num2;
		num = num / num2;
		while(num > 1){
         calc(num, num2);
		//System.out.println("while");
		}
		return bit;
	}
}
