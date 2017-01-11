package com.codepandablog.java.ds;

public class CharStack {

	private int max;
	private char[] stackArray;
	private int top;
	
	public CharStack(int max){
		this.max=max;
		stackArray=new char[max];
		top=-1;
	}
	public void push(char input){
		stackArray[++top]=input;
	}
	public char pop(){
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
