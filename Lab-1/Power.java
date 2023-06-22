package lab_1;
import java.util.Scanner;
public class Power{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		int b = sc.nextInt();
		System.out.println("Enter Exponencial");
		int e = sc.nextInt();
		int ans = 1;
		for(int i=1; i<=e; i++){
			ans = ans*b;
		}
		System.out.println("Ans is: "+ans);
	}
}