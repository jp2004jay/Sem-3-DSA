package lab_2;
import java.util.Scanner;
public class ReadAndDisplayArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Display elements: ");
		for(int temp : a){
			System.out.print(temp + ", ");
		}
	}
}