package LinkedList.Sinlgy;

public class Main {
	static Node head = new Node(null, 1);

	public static void main(String[] args) {
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insertBefore(4, 6);
		// System.out.println(head.next.next.next);
		// Node searchedNode=search(4,head);
		// System.out.println(searchedNode);
		// delete(3 , head);
		// System.out.println(search(2,head));
		System.out.println(head);
		System.out.println(reverse(head));
	}

	public static void insert(int data) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(null, data);
	}

	public static void insertBefore(int nodeData, int data) {
		if (nodeData == head.data) {
			Node newNode = new Node(head, data);
		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == nodeData) {
					Node newNode = new Node(temp.next, data);
					temp.next = newNode;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public static Node search(int data, Node node) {
		Node temp = node;
		while (temp != null) {
			if (temp.data == data) {
				return temp;
			}
			temp = temp.next;
		}

		return null;
	}

	public static void delete(int nodeData, Node head) {
		if (nodeData == head.data) {
			Node newHead = head.next;
			head = newHead;
		} else {
			Node temp = head;

			while (temp.next != null) {
				if (temp.next.data == nodeData) {
					Node newNext = temp.next.next;
					temp.next = newNext;
					break;
				}
				temp = temp.next;
			}

		}
	}
	// 1->2->3->4
	// 2->1

	public static Node reverse(Node node) {

		Node temp = node;

		Node newNode = null;
		Node newTempNode = null;
		while (temp != null) {
			if (newNode == null) {
				newNode = new Node(null, temp.data);
			} else {
				// newNode=newNode.next;
				newTempNode = new Node(null, temp.data);
				newTempNode.next = new Node(newNode.next, newNode.data);
				newNode = newTempNode;
			}
			temp = temp.next;
		}
		return newNode;
	}
}
