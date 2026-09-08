package javaPrograming;
import java.util.*;
public class printIndexofK {
	public static void indexOf(int[] ar,int k)
	{
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]==k)
			{
				 System.out.println(i);
				 return;
			}
		}
		System.out.print(-1);
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i =0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		indexOf(ar,k);
	}
}
