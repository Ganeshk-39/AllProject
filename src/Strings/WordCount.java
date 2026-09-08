package Strings;
import java.util.*;

public class WordCount {
	public static void String(String s)
	{
		int count = 0;
		for(int i= 0; i<s.length()-1; i++)
		{
			if(s.charAt (i) == ' ' && s.charAt(i+1)!= ' ')
			{
				count++;
			}
		}
		System.out.print(s.charAt(0) == ' '? count : count+1);
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		String(s);

	}

}
