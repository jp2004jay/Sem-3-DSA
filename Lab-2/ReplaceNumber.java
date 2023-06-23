package lab_2;
import java.util.Scanner;
public class ReplaceNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter 1st number");
		int p = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int q = sc.nextInt();
		
		for(int i=0; i<n; i++){
			if(a[i] == p){
				a[i] = q;
			}
		}
		
		System.out.println("Modified Array: ");
		for(int temp : a){
			System.out.print(temp+", ");
		}
	}
}