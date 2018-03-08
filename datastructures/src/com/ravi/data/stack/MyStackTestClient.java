package com.ravi.data.stack;

public class MyStackTestClient {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(3);
		myStack.push("Ravi");
		myStack.push("Kumar");
		myStack.push("Goka");
		myStack.display();
		
		//System.out.println(myStack.peek());
		
		myStack.pop();
		myStack.display();
		
		myStack.push("Goka");
		myStack.display();
	}

}
