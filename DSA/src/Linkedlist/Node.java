package Linkedlist;
//Creating_a_Singly_LinkedList
public class Node {
	
	int data;
	Node next;
	
	Node(int data1){
		this.data = data1;
		this.next = null;
	}
	
	static Node convertArr2LL(int arr[]) {
		Node head = new Node(arr[0]);
		Node current = head;
		
		 // Create and link the rest of the nodes
		for(int i=1;i<arr.length;i++) {
			current.next = new Node(arr[i]);
			current = current.next;
		}
		
		// Traverse and print the list
		 Node temp = head;
		 while(temp != null) {
			 System.out.print(temp.data + " -> ");
			 temp = temp.next;
		 }
		return head;
		 
	}
	
	 //Length of the LinkedList
	 static void LengthOfLL(Node head) {
		 int count=0;
		 Node temp = head; 
		 while(temp != null) {
			 temp= temp.next;
			 count++;
		 }
		 System.out.println("\nLength of Linked List: " + count);
	 }
	 

	public static void main(String[] args) {
		 int arr[] = {11, 43, 54, 22, 45};
		// Create a single node with value 22 (arr[3])
		 Node n = new Node(arr[3]); //creation of a singly linked list node
		 System.out.println(n.data); // Output: 22
		 
		 //Traverse and print the list
		 convertArr2LL(arr);
		 
		 //Length of the LinkedList
		 Node head = convertArr2LL(arr);
		 LengthOfLL(head);
		 
	}

}
