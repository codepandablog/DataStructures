package com.codepandablog.java.ds;

public class ClassDataArrayApp {

	public static void main(String[] args) {

		ClassDataArray array=new ClassDataArray(100);
		array.insert("Chandra", "Hem", 25);
		array.insert("Chandel", "Aman", 18);
		array.insert("Das", "Ankur", 50);
		
		array.display();
		
		if(null!=array.find("Das"))
			System.out.println("Record found.");
		else
			System.out.println("Record not found");
	}

}
