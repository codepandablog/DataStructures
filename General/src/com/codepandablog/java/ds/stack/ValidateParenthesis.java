package com.codepandablog.java.ds.stack;

import java.util.Stack;

public class ValidateParenthesis {

	public static void main(String[] args) {
		
		//String input=args[0];
		String input="(a+(b*c)-d)";
		Stack<Integer> stack=new Stack<Integer>();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='('){
				stack.push(i);
			}else if(input.charAt(i)==')'){
				try{
					int popped=stack.pop()+1;
					System.out.println("')' at index "+i+" is matched.");
				}catch(Exception ex){
					System.out.println("')' at index "+i+" is un-matched.");
				}
			}
			
		}
		if(!stack.isEmpty())
			System.out.println("Input string is not valid for Parenthesis");
		else
			System.out.println("Input string is valid for Parenthesis");

	}

}
