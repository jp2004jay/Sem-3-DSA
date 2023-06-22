package lab_1;
import java.util.Scanner;
public class VowelOrNot{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charactor");
		char ch = sc.next().charAt(0);
		String cheke = "AEIOUaeiou";
		if(cheke.indexOf(ch) == -1){
			System.out.println("Charactor is not Vowel");
		}
		else{
			System.out.println("Charactor is Vowel");
		}
	}
}