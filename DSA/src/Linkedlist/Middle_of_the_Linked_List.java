package Linkedlist;

class Node4{
	int data;
	Node next;
	
	Node4(int data1){
		this.data = data1;
		this.next = null;
	}
}
public class Middle_of_the_Linked_List {
	
	static Node convertArr2LL(int arr[]) {
		Node head = new Node(arr[0]);
		Node current = head;
		
		for(int i=1;i<arr.length;i++) {
			current.next = new Node(arr[i]);
			current = current.next;
		    }
			return head;
	}
	
	//Print the LL
	static void printLL(Node head) {
			while(head !=null) {
				System.out.print(head.data + " -> ");
				head = head.next;
			}
			System.out.print("null");
	}
	
	static Node FindMiddleOfLinkedList(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			// Move fast two steps.
			fast = fast.next.next;
			 // Move slow one step.
			slow = slow.next;
		}
        // Return the slow pointer,
        // which is now at the middle node.
		return slow;
	}
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Node head = convertArr2LL(arr);
		head = FindMiddleOfLinkedList(head);
		printLL(head);
		
		
	}

}

//TC = O(n/2);
