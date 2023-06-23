package lab_2;
import java.util.Scanner;
public class SmallestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		int smallIndex = 0;
		int small = a[smallIndex];
		
		for(int i=0; i<n; i++){
			if(a[i] < small){
				small = a[i];
				smallIndex = i;
			}
		}
		
		System.out.println("Small element is: "+small +", found at: "+smallIndex+" position.");
	}
}