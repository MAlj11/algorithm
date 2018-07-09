package maxjiange;

import java.util.Scanner;

/**
 * 给定一个递增序列，a1 <a2 <...<an 。
 * 定义这个序列的最大间隔为d=max{ai+1 - ai }(1≤i<n),
 * 现在要从a2 ,a3 ..an-1 中删除一个元素。
 * 问剩余序列的最大间隔最小是多少？
 * @author MA
 *第一行，一个正整数n(1<=n<=100),序列长度;接下来n个小于1000的正整数，表示一个递增序列。
 */


//自己想的方法复杂度太大了
//看到了别人写的一个，还不错
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt(),i;
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int maxFull = Integer.MIN_VALUE,minMaxGap = Integer.MAX_VALUE;
            for (i = 1; i < n; i++) {
                maxFull = Math.max(maxFull, arr[i]-arr[i-1]);
            }
            for (i = 1; i < n-1; i++) {
                minMaxGap = Math.min(minMaxGap, Math.max(arr[i+1]-arr[i-1], maxFull));
            }
            System.out.println(minMaxGap);
        }
        in.close();
    }
}
