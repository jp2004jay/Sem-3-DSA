package lab_1;
import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("Area is: "+area);
	}
}