package com.codepandablog.java.ds;

public class ObjectSortApp {

	public static void main(String[] args) {

		ArrayInObj array=new ArrayInObj(100);
		array.insert("Evans", "Patty", 24);
		array.insert("Smith", "Doc", 59);
		array.insert("Smith", "Lorraine", 37);
		array.insert("Smith", "Paul", 37);
		array.insert("Yee", "Tom", 43);
		array.insert("Hashimoto", "Sato", 21);
		array.insert("Stimson", "Henry", 29);
		array.insert("Velasquez", "Jose", 72);
		array.insert("Vang", "Minh", 22);
		array.insert("Creswell", "Lucinda", 18);
		System.out.println("Before sorting:");
		array.display(); // display items
		array.insertionSort();
		array.display();
	}

}
