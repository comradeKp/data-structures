package com.kpcorp.datastructures.stack.array;

public class Stack {
	private int top;
	private int[] stack = new int[5];

	public void push(int data) {
		if (size() == 5) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public void show() {
		for (int i = top - 1; i >= 0; i--)
			System.out.println(stack[i]);
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty...");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;

	}

	public int peep() {
		return stack[top - 1];
	}
}
