package LinkedList.Sinlgy;

public class Node {
	public Node next;
	public int data;
	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}
	
}
