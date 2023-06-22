package lab_1;
import java.util.Scanner;
public class FactorialRecursion{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int n = sc.nextInt();
		System.out.println("Factorial is: "+factorial(n));
	}
	public static int factorial(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
}