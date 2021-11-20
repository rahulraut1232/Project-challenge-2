/*Question 2: Given a linked list, swap every two adjacent nodes
and return its head. You must solve the problem without
modifying the values in the list's nodes (i.e., only nodes
themselves may be changed.)*/
class LinkedList{
	static class Node{
		Node next;
		int data;
		Node(){
			next = null;
			data = 0;
		}
		Node(int val){
			next = null;
			data = val;
		}
	}
	private Node head;
	LinkedList(){
		head = null;
	}
	public void addFirst(int val){
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	public void addLast(int val){
		Node newNode = new Node(val);
		if(head==null){
			head=newNode;
		}
		else{
		Node trav=head;
		while(trav.next!=null){
			trav=trav.next;
		}
		trav.next=newNode;
		}
	}
	void pairWiseSwap()
    {
        Node temp = head; 
        while (temp != null && temp.next != null) {
            int var = temp.data;
            temp.data = temp.next.data;
            temp.next.data = var;
            temp = temp.next.next;
        }
    }
	void display(){
		Node trav = head;
		while(trav != null){
			System.out.println(trav.data);
			trav = trav.next;
		}
	}
}
class SwapingNodes{
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.display();
		System.out.println("-------------------------");
		l.pairWiseSwap();
		l.display();
	}
}