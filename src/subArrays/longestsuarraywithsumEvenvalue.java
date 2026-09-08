package subArrays; 
import java.util.*;

public class longestsuarraywithsumEvenvalue{
	public static void longestSubarray (int[] ar)
	{
		int sum = 0;
		for(int size = ar.length; size>=0; size--)
		{
			for(int i = 0; i<=ar.length-size; i++)
			{
				 sum = 0;
				for(int j = i; j<i+size; j++)
				{
					sum = sum+ar[j];
				}
				if(sum%2 ==0)
				{
					for(int j = i; j<i+size; j++)
					{
						System.out.print(ar[j] + " ");
					}
					return;
					
				}
				
			}
		}
		
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
		longestSubarray(ar);
	}
}
