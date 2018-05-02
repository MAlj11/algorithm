package mergelist;



/**
 * 问题描述： 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
 * @author MA
 *
 */
class ListNode{
	int data;
	ListNode next;
	public ListNode(int data,ListNode next){
		this.data = data;
		this.next = next;
	}
	
}
public class MergeList {
/*
 * 思路：两个递增的链表，先比每个第一个节点，晓得放在前面，下一个节点与另外一个链表的第一个比，以此类推
 */
	

	
	public static ListNode margeList(ListNode head1,ListNode head2){
		if(head1 == null){
			return null;
		}
		if(head2 == null){
			return null;
		}
		
		ListNode fin = null;
		if(head1.data < head2.data){
			fin= head1;
			fin.next = margeList(head1.next,head2);
		}else{
			fin = head2;
			fin.next = margeList(head1,head2.next);
		}
		return fin;
	}
	
	public static void printNode(ListNode n){
            ListNode head = n;
		while( head != null){
			System.out.println(head.data + "  ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListNode a = new ListNode(7, null);
		ListNode b = new ListNode(5, a);
		ListNode c = new ListNode(3, b);
		ListNode d = new ListNode(1, c);
		
		ListNode e = new ListNode(8, null);
		ListNode f = new ListNode(6, e);
		ListNode g = new ListNode(4, f);
		ListNode h = new ListNode(2, g);
		
		printNode(margeList(h,d));
		
	}
}
