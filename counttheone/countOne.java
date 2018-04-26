package counttheone;

/**
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。 例如把9表示成二进制是1001，有2位是1，因此如果输入9，该函数输出2.
 * 
 * @author MA
 * 
 */

public class countOne {

	/*
	 * 思路：可以把这个整数先与1做与运算，如果得1遍记录一次，之后将这个数向右移一位，再与1与
	 * 当往右移时可以用除以2解决，效果一样，但是乘除法要比位运算效率低 还有个问题：如果是负数就会陷入死循环
	 * 所以可以不以输入得数，而是将作比较的1向左移，然后在与，但是有多少位整数就需要循环多少次，复杂度就高了，也不好
	 * 
	 * 最终方案： 将原数-1，将相当于将原数最右边的1变为0,1之后的零都变成一，这个数在于原数相与，这样出来的就是原数最右边的1变成零，
	 * 其他位不变，一直循环这个方法 知道都变成0
	 */

	public static int countnumOne(int Num) {
		int count = 0;

		while (Num != 0) {
			count++;
			Num = Num & (Num - 1);

		}

		return count;
	}

//-----------------------------------------------------------------------------------------------------------
	/**
	 * 变种1：判断一个数是不是2的整数次方
	 * @param args
	 */
	public static boolean IntTwo(int num){
	/*
	 * 思路：2的整数次方的整数2进制只有一个1
	 * 
	 */
	/*	boolean booflag = false;
		int flag = countOne.countnumOne(num);
		if(flag == 1){
			booflag = true;
		}
		return booflag;*/
		
		boolean booflag = false;
		int flag = num & (num - 1);     //因为只有一个1，所以原数与原数减1相与后应该为0
		if(flag == 0){
			booflag = true;
		}
		return booflag;
	}

	
//----------------------------------------------------------------------------------------------------------------
	/**
	  * 变种2：判断两个数有多少位不一样
	  * 思路：先让两个数异或
	  * 异或：0^0=0  0^1=1  1^0=1  1^1=0
	  * 所以两个数不一样使就会等于1   之后在判断1的个数
	  * @param args
	  */
	
	
//----------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		System.out.println(countOne.countnumOne(90000));
		System.out.println(countOne.IntTwo(2));
	}
}
