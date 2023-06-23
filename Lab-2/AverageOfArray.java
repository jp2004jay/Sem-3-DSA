package lab_2;
import java.util.Scanner;
public class AverageOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int temp : a){
			sum = sum + temp;
		}
		
		System.out.println("Average is: "+((float)sum/n));
	}
}