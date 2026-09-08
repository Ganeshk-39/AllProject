package arrayTravesel;

import java.util.Scanner;

public class secondLargestElement {
	public static void secondLargestElemen(int[] ar)
	{
		int p = 0, vp =0;
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]>p)
			{
				vp =p;
				p=ar[i];
			}
			else if(ar[i]>vp)
			{
				vp = ar[i];
			}
		}
		System.out.print(vp);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] ar = new int[n];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		secondLargestElemen(ar);
	}

}
