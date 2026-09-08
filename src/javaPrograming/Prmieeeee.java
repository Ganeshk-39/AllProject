package javaPrograming;

import java.util.Scanner;



public class Prmieeeee {
	public static  void chekPrime(int n, int m)
	{
		for(int i = n; i<=m; i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean checkPrime(int n)
	{
		for(int i = 0; i*i<=n; i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int m = scan.nextInt();
		 chekPrime(  n, m);

	}

}
