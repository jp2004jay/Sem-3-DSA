import java.util.*;

public class Recognize2{
	public static boolean isValid(String s){
		Stack<Character> s1 = new Stack<Character>();
		Stack<Character> s2 = new Stack<Character>();

		int index = s.indexOf("b");
		
		for(int i=0; i<index; i++){
			if(s.charAt(i) == 'a'){
				s1.push(s.charAt(i));
			}
			else{
				return false;
			}
		}

		for(int i=index; i<s.length(); i++){
			if(s.charAt(i) == 'b'){
				s2.push(s.charAt(i));
			}
			else{
				return false;
			}
		}

		if(s1.size() == s2.size()){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String to Recognize");
		String name = sc.next();

		if(isValid(name)){
			System.out.println("String is Valid");
		}
		else{
			System.out.println("String is Invalid");
		}
	}
}