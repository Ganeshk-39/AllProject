package subArrays;
import java.util.*;

public class even {
	public static void even(int[] ar)
	{
		for(int size = 1; size<=ar.length; size++)
		{
			for(int i = 0; i<=ar.length-size; i++)
			{
				int sum = 0;
				for(int j = i; j<i+size; j++)
				{
					if(sum%2 == 0)
					{
						System.out.print(sum);
					}
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
		even(ar);
	}
}


