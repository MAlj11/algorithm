package stackToqueue;

import java.util.Stack;

/*
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHead,
 * 分别完成在队列尾部插入结点和在队列头部删除结点的功能
 * 
 * 思路：两个栈   一个栈作为输入的栈，另一个是作为输出缓冲的栈，stack1栈pop后直接push进stack2中
 * 然后pop出stack2
 */
public class stacktoQueue {
	static Stack<Integer> stack1 = new Stack<Integer>();   //压入
	static Stack<Integer> stack2 = new Stack<Integer>();   //缓冲输出
	
	
	public static void appendTail(int a){
		stack1.push(a);		
	}
	
	public static int deleteHead() throws Exception{
		if(stack1 == null && stack2 == null){
			throw new Exception("没有数");
		}else{
			while(!stack1.empty()){
		     stack2.push(stack1.pop());
			}
		}
		return(stack2.pop());	
		
	}

	
	public static void main(String[] args) {
		stacktoQueue.appendTail(1);
		stacktoQueue.appendTail(2);
		stacktoQueue.appendTail(3);
		try {
			System.out.println(stacktoQueue.deleteHead());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
