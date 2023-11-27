package com.demo.test;

public class StackUsingLL {
	private Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			data=d;
			next=null;
		}
	}
	
	public StackUsingLL() {
		head=null;
	}

	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	
	public void push(int n) {
		Node newnode=new Node(n);
		
		if(isEmpty()) {
			head=newnode;
		}
		else {
			newnode.next=head;   //always add at first position
			head=newnode;
		}
		System.out.println(newnode.data+" added successfully...");
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("can't delete,bcoz queue is empty!!!");;
		}
		else {
			Node temp=head;
			head= temp.next;
			System.out.println(temp.data+" is removed successfully");
			temp.next=null;
			temp=null;
		}
	}
	
	public static void main(String[] args) {
		StackUsingLL ob=new StackUsingLL();
		
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		System.out.println();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
	}
}
