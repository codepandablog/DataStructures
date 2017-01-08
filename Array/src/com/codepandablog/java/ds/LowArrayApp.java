package com.codepandablog.java.ds;

public class LowArrayApp {

	public static void main(String[] args) {
		LowArray array = new LowArray(100);
		int j = 0;
		int nElement = 0;
		array.setElement(0, 77); // insert 10 items
		array.setElement(1, 99);
		array.setElement(2, 44);
		array.setElement(3, 55);
		array.setElement(4, 22);
		array.setElement(5, 88);
		array.setElement(6, 11);
		array.setElement(7, 00);
		array.setElement(8, 66);
		array.setElement(9, 33);
		nElement = 10; // now 10 items in array

		// display
		for (j = 0; j < nElement; j++) {
			System.out.print(array.getElement(j) + " ");
		}
		System.out.println();

		// search
		int searchKey = 66;
		for (j = 0; j < nElement; j++) {
			if (searchKey == array.getElement(j))
				break;
		}
		if (j == nElement) {
			System.out.println("Could not find key:" + searchKey);
		} else {
			System.out.println("Search key " + searchKey + " found.");
		}

		// delete value
		int deleteElement = 44;
		for (j = 0; j < nElement; j++) {
			if (deleteElement == array.getElement(j)){
				break;
			}
		}
		for (int i = j; i < nElement; i++) {
			array.setElement(i, array.getElement(i + 1));

		}
		nElement--;
		
		// display
		for (j = 0; j < nElement; j++) {
			System.out.print(array.getElement(j) + " ");
		}
		System.out.println();
	}

}
