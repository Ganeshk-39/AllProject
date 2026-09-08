package Strings;
import java.util.*;

public class LengthFinder {
	public static void LengthFinder(String s)
	{
		
		for(int i= 0; i<s.length(); i++)
		{
			System.out.print(s.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		LengthFinder(s);

	}

}