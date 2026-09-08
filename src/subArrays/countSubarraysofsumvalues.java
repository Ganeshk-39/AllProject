package subArrays;
import java.util.*;

public class countSubarraysofsumvalues {
	public static void countsubarray(int[] ar)
	{
		int sum = 0; int count = 0;
		for(int size = 1; size<=ar.length; size++)
		{
			for(int i = 0; i<=ar.length-size; i++)
			{
				 sum = 0;
				for(int j = i; j<i+size; j++)
				{
					sum = sum+ar[j];
				}
				if(sum == 6)
				{
					count++;
				}
			}
		}
		System.out.println(count);
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
		countsubarray(ar);
	}
}
