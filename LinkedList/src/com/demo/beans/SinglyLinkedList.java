package com.demo.beans;

public class SinglyLinkedList {
	private Node head;

	class Node {
		int data;
		Node next;

		public Node(int n) {
			data = n;
			next = null;
		}
	}

	public SinglyLinkedList() {
		head = null;
	}

	public void addFirst(int n) {
		Node newnode = new Node(n);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int n) {
		Node newnode = new Node(n);
		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}

	}

	public void addAtPosition(int n, int pos) {

		if (head == null && pos != 1) {
			System.out.println("head is null, can't add at " + pos);
			;
		}
		if (pos == 1) {
			addFirst(n);
		} else {
			Node newnode = new Node(n);
			Node temp = head;
			for (int i = 1; i <= pos - 2; i++) {
				temp = temp.next;
			}
			if(temp!=null) {
				newnode.next = temp.next;
				temp.next = newnode;
			}
			else
				System.out.println("wrong position !!!");
		}
	}
	
	public void display() {
		Node temp = head;
		while (temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
       

	
	public static void main(String[] args) {
		SinglyLinkedList ob=new SinglyLinkedList();
		
		ob.addLast(10);  
		ob.addLast(20); 
		ob.addLast(30);  
		ob.addLast(50);  //10,20,30,50
		ob.display();
		System.out.println();
		
		ob.addFirst(5);  //5,10,20,30,50
		ob.display();
		System.out.println();
		
		ob.addAtPosition(40, 5); //5,10,20,30,40,50
		ob.display();
		
	}

}
