package encapsulation;

class Bankkkkkk
{
	private int bal;
	private String name;
	private int password;

	Bankkkkkk()
{
	
}
public int getBal()
{
	return bal;
}
public String getName()
{
	return name;
}
public int  getPassword()
{
	return password;
}
}



public class ZeroConstructer {
	public static void main(String[] args) {
		Bankkkkkk b =new Bankkkkkk();   // Zero parameterr constructer
		 System.out.println(b.getBal());
			System.out.println(b.getName());
			System.out.println(b.getPassword());
		
	}

}
