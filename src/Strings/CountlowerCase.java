package Strings;
import java.util.*;

public class CountlowerCase {
	public static void CountLowerCase(String s)
	{
		int count = 0;
		for(int i= 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				count++;
			}
		}
		System.out.print(s.charAt(0) == ' '? count : count++);
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		CountLowerCase(s);

	}

}

