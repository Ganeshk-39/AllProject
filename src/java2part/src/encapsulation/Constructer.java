package encapsulation;

class Bank
{
	private int bal;
	private String name;
	private int password;

 Bank(int bal, String name, int password)
{
	this.bal = bal;
	this.name = name;
	this.password = password;
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




public class Constructer {
  public static void main(String[] args) {
	 Bank b =new Bank(123,"gaesh",2345);   //constructer
	 System.out.println(b.getBal());
		System.out.println(b.getName());
		System.out.println(b.getPassword());
}
}
