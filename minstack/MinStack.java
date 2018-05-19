package minstack;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min函数
 * @author MA
 *
 */

public class MinStack {
	
	/*
	 * 思路：定义一个辅助栈，数据栈每压进来一个数字，都和辅助栈里的数字去比较
	 * 如果小于辅助栈中的数，则压入这个数，如果大于则再压入一遍辅助栈栈顶的数
	 * 保证辅助栈里存放的都是当时数据栈里最小的数
	 */
	
	static Stack<Integer> stack1 = new Stack<Integer>();
	 //数据栈
	static Stack<Integer> stack2 = new Stack<Integer>();
	//辅助栈
	
	
	public static int minStack(){
		
		return stack2.peek();
		
	}
	
	//两个栈弹出数据
	public static void pop(){
		if(stack1.empty() || stack2.empty()){
			System.out.println("栈为空");
			return;
		}
	   stack1.pop();
	   stack2.pop();
	}
	
	//两个栈压入数据
	public static void push(Integer num){
		if(stack1.empty() || stack2.empty()){  
			stack1.push(num);
			stack2.push(num);
		}
		
		if(num < stack2.peek()){
			stack1.push(num);
			stack2.push(num);
		}else{
			stack1.push(num);
			stack2.push(stack2.peek());
		}
	}
	
	
	public static void main(String[] args) {
		    push(9);
	        System.out.println(minStack());
	        push(8);
	        System.out.println(minStack());
	        push(10);
	        System.out.println(minStack());
	        pop();
	        System.out.println(minStack());
	        pop();
	        System.out.println(minStack());
	        push(0);
	        System.out.println(minStack());


	}

}
