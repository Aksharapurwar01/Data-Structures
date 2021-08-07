package bridgelabz;

public class Linkedlist {

	// reference to head / first node of the Singly Linked List
	public Node head = null;

	// class Node that hold data and a reference/link
	// to the next Node in the list
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
  
    /*
	 * Method to add a node at the beginning of the list
	 */
	public void addNodeAtTheBeginning(int data) {
        System.out.println("Add a node with data " + data + " in the beginning.");
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (this.head == null) {
			// Make the new node as head
			this.head = newNode;
		} else {
			// Point the new node's next to head
			newNode.next = this.head;

			// Make the new node as head
			this.head = newNode;
		}
	}
  
    

  	public void print() {
		if (this.head == null) {
			System.out.println("The List is empty.");
		} else {
			System.out.println("The contents of the Singly Linked List are : ");
			Node cur = this.head;
			while (cur != null) {
				System.out.print(cur.data + " -> ");
				cur = cur.next;
			}
			System.out.println("NULL\n");
		}
	}
  
  	public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        System.out.println("Created a singly linked list .....");
	    list.print();
		list.addNodeAtTheBeginning(56);
	    list.print();
		list.addNodeAtTheBeginning(30);
		list.print();
		list.addNodeAtTheBeginning(70);
		list.print();
      	
    }
}
