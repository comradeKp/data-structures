package com.kpcorp.datastructures.stack.array;

public class Runner {

	public static void main(String[] args) {
		Stack nums = new Stack();
		System.out.println(nums.pop());
		nums.push(1);
		nums.push(2);
		nums.push(3);
		nums.push(4);
		nums.push(5);
		nums.push(6);
		nums.show();

	}

}
