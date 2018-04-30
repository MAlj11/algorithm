package findk;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 * 
 * @author MA
 * 
 */

public class FindK {

	/*
	 * 思路：设置两个索引第一个索引动的时候第二个不动，直到第一个走到k的时候第二个才能动，所以当第一个走到头的时候 第二个指的正好是到数第k个节点
	 * 
	 * 注意：1,、当k<=0时，返回空  2、当k大于节点数时返回空
	 */

	static class ListNode {
		int node;
		ListNode next;

		public ListNode(int node, ListNode next) {
			this.node = node;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode [node=" + node + "]";
		}
	}

	public static ListNode findK(ListNode head, int k) {

		ListNode index = head;
		int i = 0;
		for (i = 0; index != null && i < k; i++) {         //当便利到最后一个节点，或者是到k的那个节点时停止，并记录i的值
			index = index.next;
		}
		if (i != k) {                       //如果此时i不等于k，则说明k的值超过了节点数，或者是<=0
			
			return null;
		}
		ListNode index2 = head;                //在从头结点定义一个索引
		while (index != null) {              //继续向前走，直到第一个索引到头，这是第二个索引指的节点就是k
			index = index.next;
			index2 = index2.next;
		}

		return index2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1, null);
		ListNode b = new ListNode(2, a);
		ListNode c = new ListNode(3, b);
		ListNode k = FindK.findK(c, 0);
		System.out.println(k);
	}
}
