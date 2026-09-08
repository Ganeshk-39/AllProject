package javaPrograming;
import java.util.*;
public class sumOfArray {
	 public static void sum(int ar[])
	{
		int sum = 0;
		for(int i = 0; i<ar.length; i++)
		{
			sum = sum+ar[i];
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		  int [] ar = new int[n];
		  for(int i =1; i< ar.length; i++)
		  {
			  ar[i] = scan.nextInt();		 
		  }
		  sum(ar);
	}

}
