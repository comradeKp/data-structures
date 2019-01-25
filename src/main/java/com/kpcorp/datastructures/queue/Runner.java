//Implementation with Array
//	First in first out
// enqueue(data) = Inserting elements into array ->inserting in the rear end
//dequeue() =  Removing Elements from queue -> Removing from front end
//		size()
//		isEmpty()
//		peek()
package com.kpcorp.datastructures.queue;

public class Runner {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.deQueue();
		q.deQueue();
		q.enQueue(6);
		q.show();
	}

}
