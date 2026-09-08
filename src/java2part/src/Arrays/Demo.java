package Arrays;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int [] ar = new int[5];
		 for(int i = 0; i<5; i++)
		 {
			 System.out.print("Enter the age");
			
			ar[i] = scan.nextInt();
		 }
		 for(int i = 0; i<5; i++)
		 {
			 System.out.print(ar[i]+ " ");
			
		 }
		 
	}

}
