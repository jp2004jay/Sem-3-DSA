package lab_3;
import java.util.Scanner;

public class Multiplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[][] m1 = new int[3][2];
		int[][] m2 = new int[2][3];
		int[][] multy = new int[3][3];

		System.out.println("Enter first matrix\'s elements");
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				m1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter second matrix\'s elements");
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				m2[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<2; k++){
					multy[i][j] = multy[i][j] + (m1[i][k]*m2[k][j]);
				}
			}
		}

		System.out.println("Multiplication: ");
		for(int a[] : multy){
			for(int temp : a){
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		
	}
}