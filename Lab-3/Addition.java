package lab_3;
import java.util.Scanner;
import java.util.Arrays;

public class Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		int[][] add = new int[2][2];

		System.out.println("Enter first matrix\'s elements");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				m1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter second matrix\'s elements");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				m2[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				add[i][j] = m1[i][j] + m2[i][j];
			}
		}

		System.out.println("Addition: ");
		for(int a[] : add){
			for(int temp : a){
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		
	}
}