package ch8.part9;

class Node {
	private int data;
	private Node next;
	
	Node(int data) {
		this.data=data;
		this.next=null;
	}
	Node() {
		this.data=0;
		this.next=null;
	}
	
	public void setData(int data) {
		this.data=data;
	}
	public int getData() {
		return this.data;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	public Node getNext() {
		return this.next;
	}
	
	public String toString() {
		return Integer.toString(this.data);
	}
}