package com.codepandablog.java.ds;

public class ClassDataArray {

	private Person[] personArray;
	private int nElems;
	
	public ClassDataArray(int max){
		personArray=new Person[max];
		nElems=0;
	}
	
	public Person find(String searchName) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (personArray[i].getLastName().equals(searchName)) {
				break;
			}
		}
		if (i == nElems)
			return null;
		else
			return personArray[i];
	}
	
	public void insert(String lastName, String firstName, int age) {
		personArray[nElems] = new Person(firstName,lastName,age);
		nElems++;
	}
	
	public boolean delete(String lastName) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (lastName.equals(personArray[i].getLastName())) {
				break;
			}
		}
		if (i == nElems) {
			return false;
		} else {
			for (int j = i; j < nElems; j++) {
				personArray[j] = personArray[j + 1];
			}
			nElems--;
			return true;
		}
	}
	
	public void display(){
		for (int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
	}
}
