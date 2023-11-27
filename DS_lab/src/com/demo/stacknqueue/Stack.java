package com.demo.stacknqueue;

public class Stack {
	private int[] arr;
	private int size;
	private int top;
	public Stack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public Stack(int n) {
		arr=new int[n];
		size=n;
		top=-1;
	}
	public boolean isEmpty() {
		/*if(top==-1)
			return true;
		else
			return false;*/
		return top==-1;
	}
	public boolean isFull() {
		/*if(top==size-1) {
			return true;
		}
		else {
			return false;
		}*/
		return top==size-1;
	}
	public boolean push(int n) {
		if (isFull()) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			arr[++top]=n;
			return true;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return -1;
		}
		else {
			int num=arr[top--];
			return num;
			
		}
	}
	
	public static void main(String[] args) {
		Stack ob=new Stack(5);
		ob.push(12);
		ob.push(34);
		ob.push(55);
		ob.push(52);
		ob.push(53);
		
		ob.push(51);
		while(!ob.isEmpty())
		   System.out.println(ob.pop());
		
		ob.pop();
	}
	
}
