package reverselist;

import DeleteNode.deletenode.ListNode;

/**
 * 题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后的链表的头结点。
 * 
 * @author MA
 * 
 */

public class ReverseList {
	/*
	 * 思路：链表的指针指向后面一个，反转链表就是将原本指向后面节点的指针指向前面、 node = node.next;
	 * 
	 * 定义一个反转之后的头节点rHead（当前链表的尾节点） 定义当前节点node 定义当前链表节点的上一个节点 frontnode
	 * 
	 * 主要是node 和 node.next 反转后node.next = node的上一个节点frontnode
	 * 所以在第一个节点的时候frontnext=null 在遍历第一个节点的时候 next=node.next 储存下一节点
	 * 将下一节点指向当时的上一节点 node.next=frontnode 上一节点指向下一轮的上一节点 就是当时链表的节点 将节点指向next
	 * 继续遍历下一个节点
	 */
	public static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data, ListNode next) {
			this.data = data;
			this.next = next;
		}

	}

	public static ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}
		ListNode frontnode = null; // 定义上一个节点 第一个节点的上一个节点为空
		ListNode node = head;
		ListNode rHead = null; // 定义反转后的头结点
		ListNode next = null; // 定义储存好的当时链表的下一节点

		while (node != null) {
			next = node.next;

			if (next == null) {
				rHead = node; // 当时链表的最后一个节点为反转后链表的头结点
			}

			node.next = frontnode; // 反转后的下一节点为当前的上一节点
			frontnode = node; // 下次遍历的上一节点为当前节点
			node = next; // 下次遍历的节点为当前节点的下一节点
		}
		return rHead;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1, null);
		ListNode b = new ListNode(2, a);
		ListNode c = new ListNode(3, b);
		ListNode d = new ListNode(4, c);
		System.out.println(reverseList(d).data);

	}
}
