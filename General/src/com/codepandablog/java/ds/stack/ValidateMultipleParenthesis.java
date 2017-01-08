package com.codepandablog.java.ds.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidateMultipleParenthesis {

	public static void main(String[] args) {
		
		//String input=args[0];
		String input="(a+([b*c)-d)";
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		boolean valid=true;
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
	 
			if (map.keySet().contains(current)) {
				stack.push(current);
			} else if (map.values().contains(current)) {
				if (!stack.empty() && map.get(stack.peek()) == current) {
					stack.pop();
				} else {
					valid=false;
				}
			}
		}
		if(valid==false){
			System.out.println("Input string is not valid for Parenthesis");
		}else if(!stack.isEmpty()){
			System.out.println("Input string is not valid for Parenthesis");
		}else{
			System.out.println("Input string is valid for Parenthesis");
		}
	}

}
