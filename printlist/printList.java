package printlist;

import java.util.Stack;

/*
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 例如：输入1->2->3，输出3->2->1
 */

/*
 * 思路：1、运用栈Stack实现，栈的存储方式是后进先出
 * 创建listNode存放链表节点    var：此节点值  next：指向下一节点
 * 
 * 2、运用递归：当指向一个节点的时候，输出下一个，，以此递归
 */

class listNode{
	int var;
	listNode next;
	public listNode(int var){
		this.var = var;
	}
	
}
public class printList {
	
	 public static void printlist(listNode node){
		 
		 if(node == null){
			 System.out.println("无数字");
		 }
		
		 Stack<listNode> stack = new Stack<listNode>();
		 while(node != null){
			 stack.push(node);
			 node = node.next;
		 }
		 while(stack != null){
			 System.out.println((stack.pop().var));
		 }
		 
		
	 }
	 
    public static void main(String[] args) {
		listNode node1 = new listNode(1);
		listNode node2 = new listNode(2);
		listNode node3 = new listNode(3);
		node1.next = node2;
		node2.next = node3;
	     printlist(node1);
		
	}
}
