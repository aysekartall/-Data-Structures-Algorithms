package stackReverse;

import java.util.Stack;

public class main {

	public static void main(String[] args) {
	
		Stack<Integer> reverseStack=new Stack<Integer>();
		reverseStack.push(5);
		reverseStack.push(10);
		reverseStack.push(15);
		reverseStack.push(20);
		reverseStack.push(25);
		reverseStack.push(30);
		reverseStack.push(35);
		System.out.println(reverseStack.peek());
		System.out.println(reverseStack.pop());
		

	while(!reverseStack.isEmpty())
	{
		int value=reverseStack.pop();
		System.out.print(value+" ");
		}
		
	}
	
}
