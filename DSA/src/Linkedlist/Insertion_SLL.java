package Linkedlist;

class Node3{
	int data;
	Node next;
	
	Node3(int data1){
		this.data = data1;
		this.next = null;
	}
}
public class Insertion_SLL {
	
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
	
	//Insert the new node at the head
	static Node insertNewNode(Node head, int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		return newNode;
	}
	
	//Insert new node at the last
	static Node insertNewNodeAtLast(Node head, int val) {
		if(head == null)
			return new Node(val);
		
		Node temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		temp.next = newNode;
		return head;
		
	}
	
	//Insert the new node at the Kth position
	static Node insertNewNodeAtKth(Node head, int val, int k) {
		if(k==0)
			return head;
		if(k==1) {
	        Node newNode = new Node(val);
	        newNode.next = head;
	        return newNode;
		}
		int count =0;
		Node temp = head;
		while(temp !=null) {
			count++;
			if(count == k-1) {
				Node x = new Node(val);
				x.next = temp.next;
				temp.next = x;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		int arr[] = {11, 43, 54, 22, 45};
		Node head = convertArr2LL(arr);
		 //printLL(head);
		 
//		 head = insertNewNode(head,100);
//		 printLL(head);
		 
//		 head = insertNewNodeAtLast(head,100);
//		 printLL(head);

		 head = insertNewNodeAtKth(head,100,4);
		 printLL(head);
		 
	}

}
//Time Complexity: O(1)
