package javaPrograming;

import java.util.Scanner;

public class currentoccurence {
	public static void currentoccurence(int[] ar, int k)
	{
		int count = 0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] ==k)
			{
				count++;
			}
		}
		System.out.print(count);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i<ar.length; i++)
		{
			ar[i]= scan.nextInt();
		}
		int k = scan.nextInt();
		currentoccurence(ar,k);
	}

}
