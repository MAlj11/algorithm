package grassgame;

import java.util.Scanner;

/**
 * 牛牛和羊羊都很喜欢青草。今天他们决定玩青草游戏。
最初有一个装有n份青草的箱子,牛牛和羊羊依次进行,牛
牛先开始。在每个回合中,每个玩家必须吃一些箱子中的
青草,所吃的青草份数必须是4的x次幂,比如1,4,16,64等
等。不能在箱子中吃到有效份数青草的玩家落败。假定牛
牛和羊羊都是按照最佳方法进行游戏,请输出胜利者的名字。 
 * @author MA
 *
 */

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			if(n % 5 == 0 || n % 5 == 2){
				System.out.println("yang");
			}else{
				System.out.println("niu");
			}
		}
	}

}
