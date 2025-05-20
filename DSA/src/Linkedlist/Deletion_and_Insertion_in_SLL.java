package Linkedlist;

class Node2{
	int data;
	Node next;
	
	Node2(int data1){
		this.data = data1;
		this.next = null;
	}
}

public class Deletion_and_Insertion_in_SLL {
	
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
	
	 //Delete a node from head
	static Node removeHead(Node head) {
		if(head ==null) return head;
		
		head = head.next;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
		}
		System.out.println();
		return head;
	}
	
	 //Delete a node from Last
	static Node removelast(Node head) {
		if(head == null || head.next == null)
			return null;
		
		Node temp= head;
		while(temp.next.next !=null) {
			temp= temp.next;
		}
		temp.next = null;
		return head;
	}
	
	 //Delete the kth Node
	static Node removeKth(Node head,int k) {
		if(head == null)
			return  head;
		if(k==1) {
			Node temp = head;
			head = head.next;
			return head;
		}
		int count =0;
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			count++;
			if(count == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		int arr[] = {11, 43, 54, 22, 45};
		Node head = convertArr2LL(arr);
//		head = removeHead(head);
//		printLL(head);
		
//		head = removelast(head);
//		printLL(head);
		
		int k =4;
		head = removeKth(head,k);
		printLL(head);
	}

}
