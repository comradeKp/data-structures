package com.kpcorp.datastructures.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(18);
		linkedList.insert(45);
		linkedList.insert(12);
		linkedList.insertAsHead(25);
		linkedList.insertAt(2, 98);
		linkedList.insertAt(0, 8);
		linkedList.show();
		linkedList.deleteAt(2);
		linkedList.show();
	}

}
