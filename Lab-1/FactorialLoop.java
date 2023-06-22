package lab_1;
import java.util.Scanner;
public class FactorialLoop{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int n = sc.nextInt();
		int ans = 1;
		for(int i=1; i<=n; i++){
			ans = ans*i;
		}
		System.out.println("Factorial is: "+ans);
	}
}