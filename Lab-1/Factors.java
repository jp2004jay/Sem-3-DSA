package lab_1;
import java.util.Scanner;
public class Factors{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factors");
		int n = sc.nextInt();
		System.out.println("Factors are: ");
		for(int i=1; i<=n; i++){
			if(n%i == 0){
				System.out.print(i + ", ");
			}
		}
	}
}