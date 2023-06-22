package lab_1;
import java.util.Scanner;
public class PrimeOrNot{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find prime or not");
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime){
			System.out.println("Number is Prime");
		}
		else{
			System.out.println("Number is Not Prime");
		}
	}
}