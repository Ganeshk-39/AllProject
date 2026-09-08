package Strings;

import java.util.Scanner;

public class countDigit {

	
		public static void count(String s)
		{
			int count = 0;
			for(int i = 0; i<s.length(); i++)
			{
				
				char ch = s.charAt(i);
				if(ch>='0' && ch<='9')
				{
					count++;
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
