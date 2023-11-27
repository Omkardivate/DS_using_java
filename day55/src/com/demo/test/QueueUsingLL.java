package com.demo.test;

import com.demo.test.StackUsingLL.Node;

public class QueueUsingLL {
	private Node head;

	class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public QueueUsingLL() {
		head=null;
	}

	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	
	public void enqueue(int n) {
		Node newnode=new Node(n);
		if(isEmpty()) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=newnode;
			
		}
		System.out.println(newnode.data+" added successfully...");
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty,can't remove!!!");
		}
		else {
			Node temp;
			temp=head;
			head= temp.next;
			System.out.println(temp.data+" removed successfully");
			temp.next=null;
			temp=null;
		}
	}

	public static void main(String[] args) {
		QueueUsingLL ob=new QueueUsingLL();
		
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		ob.enqueue(5);
		System.out.println();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		
		ob.dequeue();
		ob.dequeue();

	}

}
