package lab_3;
import java.util.Scanner;
import java.util.Arrays;
public class InsertInAssendingArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int pos=0;

        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n+1];

        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be entered : ");
        int num = sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(a[i]<num){
                pos++;
            }else{
                break;
            }
        }
        System.out.println(num + " should be entered at position "+ pos );
        
        System.out.println("\nThe old Array is : \n"+Arrays.toString(a));
        for(int i=n-1;i>=pos;i--) {
            a[i+1] = a[i];
        }
        a[pos] = num;
           
        System.out.println("The new Array is : \n"+Arrays.toString(a));
        
    }
}