package com.codepandablog.java.ds;

public class OrdArray {

	private long[] longArray;
	private int nElems;

	public OrdArray(int max) {
		longArray = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int current;
		while (true) {
			current = (lowerBound + upperBound) / 2;
			if (longArray[current] == searchKey) {
				return current;
			} else if (lowerBound > upperBound) {
				return nElems;
			} else {
				if (longArray[current] < searchKey) {
					lowerBound = current + 1;
				} else {
					upperBound = current - 1;
				}
			}
		}
	}

	public void insert(long insertKey) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (longArray[j] > insertKey)
				break;
		}
		for (int i = nElems; i > j; i--) {
			longArray[i] = longArray[i - 1];
		}
		longArray[j] = insertKey;
		nElems++;
	}

	public boolean delete(long deleteKey) {
		int j = find(deleteKey);
		if (j == nElems) {
			return false;
		} else {
			int i = 0;
			for (i = 0; i < nElems; i++) {
				if (deleteKey == longArray[i]) {
					break;
				}
			}
			for (int k = i; k < nElems; k++) {
				longArray[k] = longArray[k + 1];
			}
			nElems--;
			return true;

		}

	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(longArray[i] + " ");
		}

	}
}
