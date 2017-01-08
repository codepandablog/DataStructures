package com.codepandablog.java.ds;

public class HighArray {

	private long[] longArray;
	private int nElems;

	public HighArray(int max) {
		longArray = new long[max];
		nElems = 0;
	}

	// another approach for search
	/*
	 * public boolean find(long searchKey) { for (int i = 0; i < nElems; i++) {
	 * if (searchKey == longArray[i]) { return true; } } return false; }
	 */

	public boolean find(long searchKey) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (searchKey == longArray[i]) {
				break;
			}
		}
		if (i == nElems)
			return false;
		else
			return true;
	}

	public void insert(long insertKey) {
		longArray[nElems] = insertKey;
		nElems++;
	}

	public boolean delete(long deleteKey) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (deleteKey == longArray[i]) {
				break;
			}
		}
		if (i == nElems) {
			return false;
		} else {
			for (int j = i; j < nElems; j++) {
				longArray[j] = longArray[j + 1];
			}
			nElems--;
			return true;
		}
	}
	
	public void display(){
		for (int i = 0; i < nElems; i++) {
			System.out.print(longArray[i]+" ");
		}
		
	}
}
