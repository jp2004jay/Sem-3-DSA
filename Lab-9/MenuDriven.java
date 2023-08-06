import java.util.Scanner;

public class MenuDriven{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		Scanner scan = new Scanner(System.in);
		System.out.println("In whole program untill exit. \nA. Insert at First \nB. Insert at Last \nC. Delete at First \nD. Delete at Last \nE. Delete at Specific Position \nF. Display List \nG. Exit");
		
		int data = 0;
		int pos = 0;
		
		while(true){
			System.out.println("Please Enter: ");
			char check = scan.next().charAt(0);

			switch(check){
				case 'A':
				case 'a':
					System.out.println("Insert Data: ");
					data = scan.nextInt();
					list.insertFirst(data);
					list.display();
					break;
				case 'B':
				case 'b':
					System.out.println("Insert Data: ");
					data = scan.nextInt();
					list.insertLast(data);
					list.display();
					break;
				case 'C':
				case 'c':
					list.deleteFirst();
					list.display();
					break;
				case 'D':
				case 'd':
					list.deleteLast();
					list.display();
					break;
				case 'E':
				case 'e':
					System.out.println("Enter Position: ");
					pos = scan.nextInt();
					list.deleteSpecific(pos);
					list.display();
					break;
				case 'F':
				case 'f':
					list.display();
					break;
				case 'G':
				case 'g':
					System.exit(0);
					break;
				default:
					System.out.println("Please enter valid input");
			}
		}
	}
}