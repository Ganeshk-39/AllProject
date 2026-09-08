package Strings;
import java.util.*;

public class revareseString {
	public static void Cancatination(String s)
	{
		String t= "";
		for(int i = s.length()-1; i>=0; i--)
		{
			t = t+s.charAt(i);
		}
			System.out.print(t);	
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		
		Cancatination(s);

	}

}
