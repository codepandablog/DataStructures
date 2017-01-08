package com.codepandablog.java.ds;

public class LowArray {

	long[] longArray;

	public LowArray(int nElements) {
		longArray=new long[nElements];
	}
	
	public void setElement(int index,long key){
		longArray[index]=key;
	}
	
	public long getElement(int index){
		return longArray[index];
	}
	public int getLength(){
		return longArray.length;
	}
}
