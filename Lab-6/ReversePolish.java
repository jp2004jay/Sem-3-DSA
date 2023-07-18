import java.util.*;

public class ReversePolish{

	public static boolean isOperator(char o){
		String cheak = "+-*/^$()";
		
		if(cheak.indexOf(o) == -1){
			return false;
		}
		else{
			return true;
		}
	}

	public static int getPrecedence(char o){
		switch(o){
			case '+' : 
			case '-' : 
				return 1;
			case '*' :
			case '/' :
				return 2;
			case '^' :
			case '$' :
				return 3;
			case '(' :
			case ')' :
				return 0;
		}
		return -1;
	}

	public static String convertPostfix(String infixNotation){

		Stack<Character> operatorStack = new Stack<Character>();

		StringBuilder polishNotation = new StringBuilder();
		char[] nextChar = infixNotation.toCharArray();

		for(char c : nextChar){

			if(!isOperator(c)){
				polishNotation.append(c);
			}
			else{
				while(!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(c)){
					polishNotation.append(operatorStack.pop());
				}
				operatorStack.push(c);
			}
		}	

		while(!operatorStack.isEmpty()){
			polishNotation.append(operatorStack.pop());
		}

		return polishNotation.toString();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Infix Expression: ");
		String userIn = sc.next();

		System.out.println("\nYour Postfix Notation Is: \n" + convertPostfix(userIn));

		StringBuilder sb = new StringBuilder(userIn);

		String convertPrefix = convertPostfix(sb.reverse().toString());
		StringBuilder convertPrefixFinal = new StringBuilder(convertPrefix);

		System.out.println("\nYour Prefix Notation Is: \n" + convertPrefixFinal.reverse());
	}
}