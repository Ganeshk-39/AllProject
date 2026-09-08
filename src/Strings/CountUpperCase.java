package Strings;
import java.util.*;

public class CountUpperCase {
	public static void CountUpperCase(String s)
	{
		int count = 0;
		for(int i= 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		System.out.print(s.charAt(0) == ' ' ? count : count++);
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		CountUpperCase(s);

	}

}

