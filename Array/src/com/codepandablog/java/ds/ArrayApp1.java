package com.codepandablog.java.ds;

public class ArrayApp1 {

	public static void main(String[] args) {
		long[] longArray=new long[100];
		int nElements=0;
		int j;
		long searchKey;
		longArray[0] = 77; // insert 10 items
		longArray[1] = 99;
		longArray[2] = 44;
		longArray[3] = 55;
		longArray[4] = 22;
		longArray[5] = 88;
		longArray[6] = 11;
		longArray[7] = 00;
		longArray[8] = 66;
		longArray[9] = 33;
		nElements = 10; // now 10 items in array
		
		//display items
		for (int i = 0; i < nElements; i++) {
			System.out.println(longArray[i]);
		}
		
		//search item
		searchKey=66;
		for (j = 0; j < nElements; j++) {
			if(searchKey==longArray[j])
				break;
		}
		if(j==nElements)
			System.out.println("Could not find search key");
		else
			System.out.println("Found search Key");
		
		//delete item
		searchKey=55;
		for (j = 0; j < nElements; j++) {
			if(searchKey==longArray[j])
				break;
		}
		for(int k=j; k<nElements-1; k++) // move higher ones down
			longArray[k] = longArray[k+1];
		nElements--;
		
		//display elements after deletion
		for (j = 0; j < nElements; j++) {
			System.out.println(longArray[j]);
		}
		
		System.out.println("Length of array:"+nElements);
	}

}
