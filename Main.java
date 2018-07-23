package numbergame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 牛牛举办了一场数字游戏,有n个玩家参加这个游戏,游戏开始每个玩家选定一个数, 然后将这个数写在纸上(十进制数,无前缀零),然后接下来对于每一个数字将其数位
 * 按照非递减顺序排列,得到新的数,新数的前缀零将被忽略。得到最大数字的玩家赢 得这个游戏。
 * 
 * @author MA
 *
 */

public class Main {

	public static int maxNum(String num, int count) {
		TreeSet<Integer> set = new TreeSet<>();
		String[] numarr = num.split(" ");
		int value = 0;
		for (int i = 0; i < numarr.length; i++) {
			value = refatornum(numarr[i]);
			//System.out.println(numarr[i]);
			set.add(value);
		}
		return set.last();
	}

	public static int refatornum(String number) {
		StringBuffer sb = new StringBuffer();
		int numInt = Integer.parseInt(number);
		TreeSet<Integer> set = new TreeSet<>();
		while(numInt != 0 ){
			int i = numInt % 10;
			set.add(i);
			numInt = numInt / 10;
		}
		int beishu = 1;
		ArrayList<Integer> list = new ArrayList<>();
        for(int i = set.size() ; i>0 ; i--){
        	 list.add(set.last() * beishu);
        	 int d = set.pollLast();
        	 beishu = beishu * 10;
        }
		int sum = 0;
		for(int i : list){
			sum = i + sum;
		}
		
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String num = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		int count = sc2.nextInt();
		int result = maxNum(num, count);
		System.out.println(result);
	}
}
