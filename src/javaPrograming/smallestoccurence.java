package javaPrograming;

import java.util.Scanner;

public class smallestoccurence {

		public static void smallest(int[] ar)
		{
		int min = ar[0];
		for(int i= 0; i<ar.length; i++)
		{
			if(ar[i]<min)
			{
				min = ar[i];
			}
		}
		System.out.println(min);
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
		smallest(ar);
		countoccurence(ar,k);
		}
}
