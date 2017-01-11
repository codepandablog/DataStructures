package com.codepandablog.java.ds;

public class ArrayBubApp {

	public static void main(String arr[]){
		ArrayBub array=new ArrayBub(100);
		array.insert(100);
		array.insert(12);
		array.insert(15);
		array.insert(-45);
		array.insert(45);
		array.insert(8);
		
		array.insert(10);
		array.insert(12);
		array.insert(1);
		array.insert(-45);
		array.insert(0);
		array.insert(2);
		array.display();
		//array.bubbleSort();
		array.selectionSort();
		array.display();
	}
}
