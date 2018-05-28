package copylist;
/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）。
 * @author MA
 *
 */

public class copyList {
	/*
	 * 思路：1.复制原始链表结点N—-》N’，并把N‘插入到N的后面。
             2.那么原来的随机指针N-》S ，此刻就应该变为：N’-S‘，显然都是很容易获得的。
             3.把上述链表拆分成两个链表，一个是原来的链表，一个是新复制的链表。
	 */

	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	
	public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        //复制接结点
        CopyList(pHead);

        //连接随机指针
        ConnectRandom(pHead);

        //拆分链表
        return ReconnectNodes(pHead);

    }
    public static void CopyList(RandomListNode pHead){
        if(pHead == null){
            return;
        }

        RandomListNode pNode = pHead;
        while(pNode != null){
            RandomListNode pCloned = new RandomListNode(pNode.label);
            pCloned.next = pNode.next;
            pCloned.random = null;

            pNode.next = pCloned;
            pNode = pCloned.next;
        }


    }
    public static void ConnectRandom(RandomListNode pHead){
        RandomListNode pNode = pHead;
        while(pNode != null){
            RandomListNode pCloned = pNode.next;
            if(pNode.random != null){
                pCloned.random = pNode.random.next;
            }

            pNode = pCloned.next;
        }
    }
    public static RandomListNode ReconnectNodes(RandomListNode pHead){

        RandomListNode pNode = pHead;
        RandomListNode pClonedHead = null;
        RandomListNode pClonedNode = null;

        if(pNode != null){
            pClonedHead = pClonedNode = pNode.next;
            pNode.next = pClonedNode.next;
            pNode = pNode.next;
        }

        while(pNode != null){
            pClonedNode.next = pNode.next;
            pClonedNode = pClonedNode.next;
            pNode.next = pClonedNode.next;
            pNode = pNode.next;
        }

        return pClonedHead;
    }
}
