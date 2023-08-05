import java.util.*;

public class InfixToPrefix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Infix String: ");
		String s = sc.nextLine();

		String prefix = convertInfixToPrefix(s);

		System.out.println("Prefix String is: \n"+ prefix);
		sc.close();
	}

	public static String convertInfixToPrefix(String s){
		
		char[] tempArray = s.toCharArray();
		
		for(int i=0; i<tempArray.length/2; i++){
			char tempVar = tempArray[i];
			tempArray[i] = tempArray[tempArray.length-i-1];
			tempArray[tempArray.length-i-1] = tempVar;
		}

		for(int i=0; i<tempArray.length; i++){
			if(tempArray[i] == '('){
				tempArray[i] = ')';
			}
			else if(tempArray[i] == ')'){
				tempArray[i] = '(';
			}
		}

		String prefix = "";

		Stack<Character> stack = new Stack<Character>();
		stack.push('(');
		s += ')';

		int rank = 0;

		for(char i : tempArray){

			if(Character.isLetterOrDigit(i)){
				prefix += i + " ";
				rank++;
			}
			else if(i == ')'){
				stack.push(i);
			}
			else if(i == '('){
				while(!stack.isEmpty() && stack.peek() != '('){
					
					prefix += stack.pop() + " ";
				}
				if(stack.isEmpty() || stack.peek() != '('){
					return "Invalid Input String";
				}
				else{
					stack.pop();
				}
			}
			else if(isOperator(i)){
				rank--;
				if(i == '^' || i == '&'){
					stack.push(i);
				}
				else{
					while(!stack.isEmpty() && getPrecedence(i) <= getPrecedence(stack.peek())){
						prefix += stack.pop() + " ";
					}
					stack.push(i);
				}
			}
		}

		if(rank != 1){
			return "Invalid Input String";
		}
		StringBuilder stTemp = new StringBuilder(prefix);
		stTemp.reverse();
		prefix = stTemp.toString();
		return prefix;
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

	public static boolean isOperator(char ch){
		return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '$';
	}
}