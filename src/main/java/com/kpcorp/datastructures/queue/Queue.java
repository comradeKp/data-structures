package com.kpcorp.datastructures.queue;

public class Queue {
	int capacity = 5;
	int queue[] = new int[capacity];
	int front;
	int rear;
	int size;

	public void show() {
		System.out.println("Elements of the Queue :");
		for (int i = 0; i < getSize(); i++) {
			System.out.print(queue[(front + i) % capacity] + "   ");
		}

		System.out.println();
		for (int i : queue) {
			System.out.print("   " + i);
		}
	}

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Stack is full ....");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % capacity;
			size++;
		}
	}

	public int deQueue() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Queue is Empty ....");
			return data;
		}
		data = queue[front];
		size--;
		front = (front + 1) % capacity;
		return data;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}
}
