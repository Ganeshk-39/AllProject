package Strings;

import java.util.Scanner;

public class consonents {
	public static void count(String s)
	{
		int count = 0;
		for(int i = 0; i<s.length(); i++)
		{
			
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
			if(!(ch =='a' || ch =='e' ||ch =='i' || ch == 'o' ||ch =='u' ||
					ch =='A' || ch=='E' ||ch =='I' || ch == 'O' ||ch =='U'))
			{
				count++;
			}
			
			}
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		count(s);
		
		

	}

}
