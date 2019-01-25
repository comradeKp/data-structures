package com.kpcorp.datastructures.stack.array;

public class DynamicStack {

	private int top;
	private int capacity = 2;
	private int[] stack = new int[capacity];

	public void push(int data) {
		if (size() == capacity)
			expand();
		stack[top] = data;
		top++;
	}

	private void expand() {
		int[] newStack = new int[capacity *= 2];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (int i = capacity - 1; i >= 0; i--)
			System.out.println(stack[i]);
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			if (size() <= capacity / 4)
				shrink();
		}
		return data;
	}

	private void shrink() {
		int[] newStack = new int[capacity /= 2];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
	}

	public int peep() {
		return stack[top - 1];
	}

}
