import java.util.*;

public class InfixToPostfix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Infix String: ");
		String s = sc.nextLine();

		String postfix = convertInfixToPostfix(s);

		System.out.println("Postfix String is: \n"+ postfix);
		sc.close();
	}

	public static String convertInfixToPostfix(String s){
		String postfix = "";

		Stack<Character> stack = new Stack<Character>();
		stack.push('(');
		s += ')';

		int rank = 0;

		for(char i : s.toCharArray()){
			if(Character.isLetterOrDigit(i)){
				postfix += i + " ";
				rank++;
			}
			else if(i == '('){
				stack.push(i);
			}
			else if(i == ')'){
				while(!stack.isEmpty() && stack.peek() != '('){
					postfix += stack.pop() + " ";
				}

				if(stack.isEmpty() || stack.peek() != '('){
					return "Invalid Input String";
				}
				else{
					stack.pop();
				}
			}
			else if(getPrecedence(i) > 0){
				rank--;
				if(i == '^' || i == '&'){
					stack.push(i);
				}
				else{
					while(!stack.isEmpty() && getPrecedence(i) <= getPrecedence(stack.peek())){
						postfix += stack.pop() + " ";
					}
					stack.push(i);
				}
			}
		}

		if(rank != 1){
			return "Invalid Input String";
		}

		return postfix;
	}

	public static int getPrecedence(char ch){
		switch(ch){
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 3;
			case '^':
			case '$':
				return 6;
		}
		return -1;
	}
}