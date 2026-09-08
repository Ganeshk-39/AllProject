/*package subArrays;
import java.util.*;

public class allSubarrays {
	public static void subArrays(int[] ar)
	{
		for(int size = 1; size<=ar.length; size++)
		{
			for(int i = 0; i<=ar.length-size; i++)
			{
				for(int j = i; j<i+size; j++)
				{
					System.out.print(ar[j] + " ");
				}
				System.out.println();
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
		subArrays(ar);
	}
}
	*/

package subArrays;
import java.util.*;

public class allSubarrays {
	public static void subArrays(int[] ar)
	{
		for(int size = 5; size>0; size--)
		{
			for(int i = 0; i<=ar.length-size; i++)
			{
				//int sum = 0;
				for(int j = i; j<i+size; j++)
				{
		//			sum = sum+ar[j];
					System.out.print(ar[j] + " ");
				}
				return;
			}
			System.out.println();
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
		subArrays(ar);
	}
}
	

