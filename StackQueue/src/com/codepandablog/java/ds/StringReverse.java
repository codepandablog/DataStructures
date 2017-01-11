package com.codepandablog.java.ds;

public class StringReverse {

	public static void main(String[] args) {
		
		String input="Hem";
		CharStack stack=new CharStack(input.length());
		char[] charArray=input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			stack.push(charArray[i]);
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}

	}

}
