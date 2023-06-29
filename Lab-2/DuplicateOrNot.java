package lab_2;
import java.util.Scanner;
public class DuplicateOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		boolean isFound = false;
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] == a[j]){
					System.out.println("Duplicate index found at: "+j);
					isFound = true;
				}
			}
		}
		
		if(!isFound){
			System.out.println("Duplicate element not found");
		}
	}
}