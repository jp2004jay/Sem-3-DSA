package lab_3;
import java.util.Scanner;
import java.util.Arrays;

public class Mearge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array:");
		int n1 = sc.nextInt();

		int[] a = new int[n1];

		System.out.println("Enter elements: ");
		for(int i=0; i<n1; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter size of second array:");
		int n2 = sc.nextInt();

		int[] b = new int[n2];

		System.out.println("Enter elements: ");
		for(int i=0; i<n2; i++){
			b[i] = sc.nextInt();
		}

		int c[] = new int[n1+n2];
		for(int i=0; i<c.length; i++){
			if(a.length <= i){
				c[i] = b[i-a.length];
			}
			else{
				c[i] = a[i];
			}
		}

		System.out.println("Merged Array\n"+Arrays.toString(c));

	}
}