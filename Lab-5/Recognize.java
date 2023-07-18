import java.util.*;

public class Recognize{
	public static boolean isValid(String s){
		if(!s.contains("c")){
			return false;
		}

		int index = s.indexOf("c");

		Stack<Character> st = new Stack<Character>();

		for(int i=0; i<index; i++){
			st.push(s.charAt(i));
		}

		for(int i=index+1; i<s.length(); i++){
			if(st.empty()){
				return false;
			}

			if(st.pop() != s.charAt(i)){
				return false;
			}
		}

		if(!st.empty()){
			return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String to Recognize");
		String name = scan.next();

		if(isValid(name)){
			System.out.println("String is Valid");
		}
		else{
			System.out.println("String is Invalid");
		}
	}

}