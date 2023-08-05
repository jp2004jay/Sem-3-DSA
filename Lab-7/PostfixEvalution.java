import java.util.*;

public class PostfixEvalution{

	public static boolean isOperater(String ch){
		String check = "+-*/^$";
		if(check.indexOf(ch) != -1){
			return true;
		}
		return false;
	}

	public static String evalExp(int a, int b, String c){
		int ans;
		switch(c){
			case "+":
				ans = a+b;
				break;
			case "-":
				ans = a-b;
				break;
			case "*":
				ans = a*b;
				break;
			case "/":
				ans = a/b;
				break;
			case "^":
			case "$":
				ans = (int)Math.pow(a,b);
				break;
			default :
				ans = 0;
		}
		return ans+"";
	}

	public static String mainPostfixEval(String equation){

		Stack<String> stack = new Stack<String>();

		if(!equation.contains(",")){
			return "Please Enter Valid Input, Seperated by ,";
		}

		for(String temp : equation.split(",")){
			temp = temp.trim();

			if(!isOperater(temp)){
				stack.push(temp);
			}
			else{

				int num1=0, num2=0;

				try{
					num1 = Integer.parseInt(stack.pop());
					num2 = Integer.parseInt(stack.pop());
				}
				catch(Exception e){
					return "Please Enter A Valid Input";
				}

				stack.push(evalExp(num2, num1, temp));
			}
			
		}

		
		if(stack.size() == 1){
			return stack.pop();
		}
		else{
			return "Please Enter a Valid Input";
		}

	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a PostFix Expression");
		String evalUserIn = scan.nextLine();
		System.out.println("Your Answer Is: " + mainPostfixEval(evalUserIn));
	}

}