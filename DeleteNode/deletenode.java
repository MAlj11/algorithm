package DeleteNode;
/**
 * 给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间删除该节点。
 * @author MA
 *
 */

public class deletenode {

/*
 * 思路：当删除节点是头结点，则头结点为空
 *      当删除的是为节点。则找到尾节点的前一节点，并删除尾节点
 *      当删除的是中间节点，则要删除的节点的后一节点内容复制到这个节点当中，将要删除的节点的索引指向后一节点的后一索引
 */
	public static class ListNode{
	 public int data;
	 public ListNode next;
	 public ListNode(int data,ListNode next){
		 this.data = data;
		 this.next = next;
	 }
	}
	
	public static void deleteNode(ListNode head,ListNode node){
		//删除的是头结点
		if(head == node){
			head = null;
		}
		
		//删除的是尾节点
		else if(node.next == null){
			while(head.next != null){
				head.next = head;
			}
			head.next = null;
		}
		//要删除的节点为中间节点
		else{
			node.data = node.next.data;    //复制信息
			node.next = node.next.next;    //下一索引指向下下索引
		
		}
	}
 
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1,null);
		ListNode b = new ListNode(2,a);
		ListNode c = new ListNode(3,b);
		ListNode d = new ListNode(4,c);
		
		deletenode.deleteNode(d,c);
		while(d != null){
			System.out.println(d.data);
			d = d.next;
		}
		
	}
}
