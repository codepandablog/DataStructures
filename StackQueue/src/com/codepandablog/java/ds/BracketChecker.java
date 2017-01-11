package com.codepandablog.java.ds;

public class BracketChecker {

	public static void main(String[] args) {

		String input = "a{b(c[d]e)f}";
		int stackSize = input.length(); // get max stack size
		CharStack theStack = new CharStack(stackSize); // make stack
		for (int i = 0; i < args.length; i++) {
			char x = input.charAt(i);
			switch (x) {
			case '{':
			case '[':
			case '(':
				theStack.push(x);
				break;
			case '}':
			case ']':
			case ')':
				if (!theStack.isEmpty()) {
					char chx = theStack.pop();
					if ((x == '{' && chx != '}') || (x == '[' && chx != ']') || (x == '(' && chx != ')')) {
						System.out.println("Error " + x + " at " + i);
					}
				} else {
					System.out.println("Error: " + x + " at " + i);
				}
				break;
			default: // no action on other chars
				break;

			}
		}
		if (!theStack.isEmpty())
			System.out.println("Error: missing right delimiter");
	} // end check()
}
