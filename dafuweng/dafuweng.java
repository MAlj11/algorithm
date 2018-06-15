package dafuweng;
/**
 * 大富翁游戏，玩家根据骰子的点数决定走的步数，即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。
 * 求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。 
 * @author MA
 *
 */

public class dafuweng {
  public static int fun(int n){
	 if(n>6 || n<1){
		 return -1;
	 }
	 
	 if(n == 1){
		 return 1;
	 }else{
		 int sum = 0;
		 for(int i=0;i<n;i++){
			 sum+=fun(i);
		 }
		 sum = sum + 1;
		 return sum;
	 }
  }
  public static void main(String[] args) {
	System.out.println(fun(1));
}
}
