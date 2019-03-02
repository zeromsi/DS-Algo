package LinkedList.Doubly;

public class Main {
	
	public static void main(String[] agrs) {
		Node head=new Node(1);
		insert(2,head);
		insert(3,head);
		System.out.println(head.next.data);
	
	}
	
	public static void insert(int data,Node head) {
		Node newNode=new Node(data);
		if(head.next==null) {
			head.next=newNode;
			newNode.previous=head;				
		}		
		else {			
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			newNode=new Node(data);
			temp.next=newNode;	
			newNode.previous=temp;
		}
	}
	

}
