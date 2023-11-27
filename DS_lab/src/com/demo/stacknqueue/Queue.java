package com.demo.stacknqueue;

import java.util.Arrays;

class Queue {
	 int arr[];
	 int size;
	 int rear = -1;
	 int front = 0;

	Queue(int n) {
		arr = new int[n];
		size = n;
	}
	public int[] getArr() {
		return arr;
	}

	public boolean isEmpty() {
		return rear < front;
	}
	
	public boolean isFull() {
		return rear == size - 1;
	}

//     enqueue
	public void add(int data) {
		if (isFull()) {
			System.out.println("queue is FULL !!!");
		} else {
			rear++;
			arr[rear] = data;
		}
	}
	// dequeue

	public int remove() {
		if (isEmpty()) {
			System.out.println("queue is EMPTY !!!");
			return -1;
		}
		int n = arr[front];
		front++;
		return n;
	}

//    peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("queue is EMPTY !!!");
			return -1;
		}
		return arr[0];
	}

	public static void main(String[] args) {
		Queue ob = new Queue(5);
		ob.add(10);
		ob.add(45);
		ob.add(42);
		
		System.out.println(Arrays.toString(ob.getArr()));
		while (!ob.isEmpty()) {
			// System.out.println(ob.peek());
			System.out.println(ob.remove() + " removed");

		}
	}
}
