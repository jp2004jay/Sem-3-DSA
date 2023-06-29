package lab_3;
import java.util.Scanner;
import java.util.Arrays;

public class DeleteNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter? ");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter index to delete the number: ");
		int index = sc.nextInt();

		System.out.println("Old Array: \n"+Arrays.toString(a));
		
		for(int i=index; i<a.length-1; i++){
			a[i] = a[i+1];
		}

		a[a.length-1] = 0;
		
		System.out.println("New Array: \n"+Arrays.toString(a));
	}
}