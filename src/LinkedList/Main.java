package LinkedList;

public class Main {
	
	private Node root;

	public static void main(String[] args) {
		Main m=new Main();
		m.init();
		m.printAll();
		m.insert("Hasan");
		
		m.printAll();
	}

	void init(){
		Node first=new Node("Shahidul");
		Node Second=new Node("Apon");
		Node third=new Node("Shadhin");
		Node fourth=new Node("Maruf");
		this.root=first;
		first.next=Second;
		Second.next=third;
		third.next=fourth;
	}
	
	void insert(String data){
		if(root.data==null) {
			this.root.data=data;
		}
		else {
			Node node=root;
			while(node.next!=null) {
				node=node.next;
			}
			Node newNode=new Node(data);
			node.next=newNode;
		}
	}
	
	void printAll() {
		Node node=root;
		System.out.println(node.data);
		while(node.next!=null) {
			
			node=node.next;
			System.out.println(node.data);
		}
		
	}
	
	void deleteFromLast() {
		if(root.data==null) {
			return;
		}else {
			Node node=root;
			while (node.next!=null) {
				node=node.next;
			}
			
		}

	}
}
