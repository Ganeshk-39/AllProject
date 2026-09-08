package reArrange;
import java.util.*;






//anni methods kin common ee method rearrange ki nuvvu  fist 
///negetive value ledha positive values print cheyala dhi matramey chude=ali



public class negative {
	public static void reArrange(int[] ar)
	{
		int[] br = new int[ar.length];
		int j = 0;
		//negative
		for(int i =0; i<ar.length; i++)                 
		{
			if(ar[i]<0)                                    
			{
				br[j] = ar[i];
				j++;
			}
		}
		//positive
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i]>=0)
			{
				br[j] = ar[i];
				j++;
			}
		}
		// print br[]
		for(int i = 0; i<br.length; i++)

	{
			System.out.print(br[i] + " ");
	}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		reArrange(ar);
	}

}
