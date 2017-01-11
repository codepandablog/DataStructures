package com.codepandablog.java.ds;

public class StackApp {

	public static void main(String[] args) {
		MyStack theStack = new MyStack(10); // make new stack
		theStack.push(20); // push items onto stack
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);

		while(!theStack.isEmpty()){
			System.out.println(theStack.pop());
		}
	}

}
