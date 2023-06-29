
package lab_3;
import java.util.Scanner;
import java.util.Arrays;

public class DeleteShortedArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter elements");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter number to delete: ");
		int number = sc.nextInt();

		int pos = -1;

		for(int i=0; i<a.length-1; i++){
			if(number == a[i]){
				pos = i;
				break;
			}
		}

		System.out.println("Old Array:\n"+Arrays.toString(a));

		try{
			for(int i=pos; i<a.length-1; i++){
			a[i] = a[i+1];
			}
			a[a.length-1] = 0;
		}
		catch(Exception e){
			System.out.println("Please Enter Valid Number Into Array");
		}
		

		
		System.out.println("New Array:\n"+Arrays.toString(a));

	}
}