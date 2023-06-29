package lab_3;
import java.util.Scanner;
import java.util.Arrays;

public class InsertNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter? ");
		int n = sc.nextInt();

		int[] a = new int[n+1];

		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter number to enter: ");
		int number = sc.nextInt();

		System.out.println("Enter index to enter the given number: ");
		int index = sc.nextInt();

		System.out.println("Old Array: \n"+Arrays.toString(a));
		
		for(int i=a.length-1; i>index; i--){
			a[i] = a[i-1];
		}

		a[index] = number;
		
		System.out.println("New Array: \n"+Arrays.toString(a));
	}
}