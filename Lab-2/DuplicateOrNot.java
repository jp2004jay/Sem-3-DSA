package lab_2;
import java.util.Scanner;
public class DuplicateOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		int dupliIndex = 0;
		int dupli = a[dupliIndex];
		for(int i=1; i<n; i++){
			if(dupli == a[i]){
				dupli = a[i];
				dupliIndex = i;
			}
		}
		
		if(dupliIndex == 0){
			System.out.println("Duplicate element not found");
		}
		else{
			System.out.println("Duplicate element found "+dupli+", At: "+dupliIndex+" Position.");
		}
	}
}