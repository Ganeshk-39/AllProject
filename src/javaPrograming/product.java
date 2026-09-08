package javaPrograming;
import java.util.*;

public class product {
	public static void product(int[] ar)
	{
		int product =1;
		for(int i =0; i< ar.length; i++)
		{
			product = product*ar[i];
		}
		System.out.println(product);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
	  product(ar);
 }
}
