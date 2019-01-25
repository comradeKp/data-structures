package com.kpcorp.datastructures.linkedlist;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		if (null == head) {
			head = node;
		} else {
			Node n = head;
			while (null != n.getNext()) {
				n = n.getNext();
			}
			n.setNext(node);
		}

	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.setData(data);
		if (0 == index) {
			insertAsHead(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
	}

	public void insertAsHead(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;

	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.getNext();
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			Node n1 = n.getNext();
			n.setNext(n1.getNext());
			System.out.println("Deleted Element = "+ n1.getData());
			n1 = null;
		}

	}

	public void show() {
		Node n = head;
		while (n.getNext() != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());
	}
}
