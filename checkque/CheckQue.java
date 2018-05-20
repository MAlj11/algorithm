package checkque;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。 
 * @author MA
 *
 */

public class CheckQue {

	/*
	 * 思路：建一个栈，根据弹出序列进行演示
	 * 在栈中按压入序列的顺序压入，直到压入到掏出序列中的数字，如果没有，则返回false
	 * 如果找到了则将次数弹出去，进行下一次判断
	 * 下一次判断时先检测此时栈顶的数字与该数字是否相等，不相等继续压入，如果都压完了还没有，则返回false
	 */
	
	public static boolean checkQue(int[] popque,int[] pushque){
		if(popque == null || pushque == null){
			return false;
		}
		int pop = popque.length;
		int push = pushque.length;
		
		if(pop == 0 || push == 0){
			return false;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int start = 0;
		for(int i=0;i<pop;i++){
			while(stack.empty() || stack.peek() != popque[i] ){ //如果栈为空，或者栈顶不是当时队列中的数
	
				if(start == push){
					return false;
				}
				stack.push(pushque[start++]);                   //往里压数直到最后一个
			}
			
			stack.pop();
			
		}
		return true;
		
	}
	public static void main(String[] args) {

        int[] push = { 1, 2, 3, 4, 5 };
        int[] pop = { 1,2,3,4,5 };

        System.out.println(checkQue(pop, push));
    }
}
