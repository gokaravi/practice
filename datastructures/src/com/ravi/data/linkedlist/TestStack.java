package com.ravi.data.linkedlist;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Ravi Kumar");
		stack.push("Poornima");
		stack.push("Kethan");
		
		
		System.out.println("Stack size: " +stack.getSize());
		System.out.println("Stack full? " +stack.isFull());
		System.out.println("Stack empty? " +stack.isEmpty());
		
		stack.push("Gnana Samhita");
		System.out.println("Stack size: " +stack.getSize());
		System.out.println("Stack full? " +stack.isFull());
		System.out.println("Stack empty? " +stack.isEmpty());
		
		System.out.println("Stack peek: " +stack.peek());
		
		String data = stack.pop();
		System.out.println("Popped element: "+data);
		
		System.out.println("Stack size: " +stack.getSize());
		System.out.println("Stack full? " +stack.isFull());
		System.out.println("Stack empty? " +stack.isEmpty());
		
		stack.push("Gnana Samhita");
		stack.push("New one");
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}

}
