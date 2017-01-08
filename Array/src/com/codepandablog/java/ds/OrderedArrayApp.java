package com.codepandablog.java.ds;

public class OrderedArrayApp {

	public static void main(String[] args) {
		OrdArray array=new OrdArray(100);
		array.insert(77); // insert 10 items
		array.insert(99);
		array.insert(44);
		array.insert(55);
		array.insert(22);
		array.insert(88);
		array.insert(11);
		array.insert(00);
		array.insert(66);
		array.insert(33);
		array.display();
		
		System.out.println();
		long searchKey=99;
		if(!(array.find(searchKey)==array.size())){
			System.out.println("Search key "+searchKey+" found.");
		}else{
			System.out.println("Search key "+searchKey+" not found.");
		}
		
		array.delete(00); // delete 3 items
		array.delete(55);
		array.delete(99);

		array.display();

	}

}
