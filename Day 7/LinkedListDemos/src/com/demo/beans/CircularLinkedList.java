package com.demo.beans;

public class CircularLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int n) {
			data=n;
			next=null;
		}
	}
	private Node head;
	public CircularLinkedList() {
		head=null;
	}
	public void addnodeByPosition(int pos,int value){
		Node newnode=new Node(value);
		//if linked list is empty and pos is other than 1
		if(head==null && pos!=1){
			System.out.println("wrong position");
		}
		//if linked list is empty and pos is 1
		if(head==null && pos==1){
			head=newnode;
			newnode.next=head;
		}
		//if linked list is not empty
		else {
			//add at the begining if pos is 1
			if(pos==1) {
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				newnode.next=head;
				head=newnode;
				temp.next=head;
			}else {
				//add in between or add at the end
				Node temp=head;
				int i;
				for(i=1;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp.next== head && i!=pos-2){
					System.out.println("wrong position");
				}
				else if(temp.next== head && i==pos-2){
					temp.next=newnode;
					newnode.next=head;
				}
				else{
					newnode.next= temp.next;
					temp.next=newnode;
				}
				//if(i>=pos-1)  mam got error here we solved it above
					newnode.next=temp.next;
					temp.next=newnode;
				//}
				
			}
		}
	}
	
	public void deleteByKey(int n){
		Node prev=null;
		Node current=head;
		//till we reach to last node
		while(current.next!=head && current.data!=n) {
			prev=current;
			current=current.next;
		}
		if(current.data==n) {
			//delete from the begining
			if(current==head) {
				Node temp=current;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=current.next;
				head=head.next;
				current.next=null;
				current=null;
			}
			//delete from in between or delete from the end
			else {
				prev.next=current.next;
				current.next=null;
				current=null;
			}
			
		}
		
	}
	
	public void displaydata() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		//to display last node value
		System.out.println(temp.data);
	}
	

}
