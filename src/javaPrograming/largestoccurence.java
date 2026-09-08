package javaPrograming;
import java.util.*;
public class largestoccurence {
	public static void largest(int[] ar)
	{
	int max = ar[0];
	for(int i= 0; i<ar.length; i++)
	{
		if(ar[i]>max)
		{
			max = ar[i];
		}
	}
	System.out.println(max);
}
public static void countoccurence(int[] ar , int k)
{
	int count = 0;
	for(int i=0; i<ar.length; i++)
	{
		if(ar[i]==k)
		{
			count++;
		}
	}
	System.out.println(count);
}
	


	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] ar = new int[n];
	for(int i=0; i<ar.length; i++)
	{
		ar[i] = scan.nextInt();
	}
	int k = scan.nextInt();
	largest(ar);
	countoccurence(ar,k);
	}

}
