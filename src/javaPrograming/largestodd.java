package javaPrograming;
	import java.util.Scanner;

	public class largestodd {
		public static void leargestodd(int[] ar)
		{
			int max = ar[0];
			for(int i = 0; i<ar.length;i++)
			{
				if(ar[i]%2!= 0 && ar[i]>max)
				{
					max = ar[i];
				}
			}
			System.out.print(max);
		}

		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int[] ar = new int[n];
			for(int i=0; i<ar.length; i++)
			{
				ar[i] = scan.nextInt();
			}
			leargestodd(ar);
		}
	}