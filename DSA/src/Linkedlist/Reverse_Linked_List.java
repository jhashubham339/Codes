package Linkedlist;

class Node5{
	int data;
	Node next;
	
	Node5(int data1){
		this.data = data1;
		this.next = null;
	}
}
public class Reverse_Linked_List {
	
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
	
	static Node reverseLL(Node head) {
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp= front;
		}
		return prev;
	}
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Node head = convertArr2LL(arr);
		head = reverseLL(head);
		printLL(head);
	}

}
