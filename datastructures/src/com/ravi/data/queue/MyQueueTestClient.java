package com.ravi.data.queue;

public class MyQueueTestClient {

	public static void main(String[] args) {
		MyQueue<String> myQueue = new MyQueue<String>(String.class, 3);
		myQueue.enqueue("Ravi");
		myQueue.enqueue("Kumar");
		myQueue.enqueue("Goka");
		myQueue.display();
		
		myQueue.dequeue();
		myQueue.display();
		
		/*myQueue.enqueue("Ravi");
		myQueue.display();*/

	}

}
