package LinkedLists;

import templates.ListNode;

public class MiddleOfLL {

	public static void main(String[] args) {
		// Create a Linked List:
		ListNode list = new ListNode();
		for(int i=1; i<=5; i++) {
			list = list.insert(list, i);
		}

		ListNode node = middleNode(list.head);
		// Print the middle node
		node.printList(node);
	}
	
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
