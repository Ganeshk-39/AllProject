package ExceptionHandling;
import java.util.*;
public class Program1
{
	public static void main(String[] args)
	{
		System.out.println("Connection is end");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scan.nextInt();
		System.out.println("Enter the dominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("connection is terminated");
	}
}
