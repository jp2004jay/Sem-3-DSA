package lab_2;
import java.util.Scanner;
public class SumMToNArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter Starting Element: ");
		int start = sc.nextInt();
		
		System.out.println("Enter Ending Element: ");
		int stop = sc.nextInt();
		
		if(start > stop){
			int temp = start;
			start = stop;
			stop = temp;
		}
		
		int sum = 0;
		for(int i=start-1; i<stop; i++){
			sum = sum + a[i];
		}
		
		System.out.println("Sum is: "+sum);
	}
}