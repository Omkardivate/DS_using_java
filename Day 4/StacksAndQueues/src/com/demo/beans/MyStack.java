<<<<<<< HEAD
package com.demo.beans;

public class MyStack {
	private int[] arr;
	private int size;
	private int top;
	public MyStack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public MyStack(int n) {
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
			top++;
			arr[top]=n;
			return true;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return -1;
		}
		else {
			int num=arr[top];
			top--;
			return num;
			
		}
	}

}
=======
package com.demo.beans;

import java.util.Arrays;

public class MyStack {
	private int[] arr;
	private int size;
	private int top;
	public MyStack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public MyStack(int n) {
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
			top++;
			arr[top]=n;
			return true;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return -1;
		}
		else {
			int num=arr[top];
			top--;
			return num;
			
		}
	}
}
>>>>>>> 269b3a10a21281977aa060f670507f148a366bc9
