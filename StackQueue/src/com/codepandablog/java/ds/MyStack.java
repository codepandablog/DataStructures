package com.codepandablog.java.ds;

public class MyStack {

	private int max;
	private long[] stackArray;
	private int top;
	
	public MyStack(int max){
		this.max=max;
		stackArray=new long[max];
		top=-1;
	}
	public void push(long input){
		stackArray[++top]=input;
	}
	public long pop(){
		return stackArray[top--];
	}
	
	public long peak(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==max-1);
	}
}
