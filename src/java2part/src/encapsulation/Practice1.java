package encapsulation;

class Bankkk
{
	private int bal;
	private String name;
	private int password;

 public void setData(int bal, String name, int password)
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




public class Practice1 {
  public static void main(String[] args) {
	  Bankkk b =new Bankkk();   
	 b.setData(123,"gaesh",2345);
	 System.out.println(b.getBal());
		System.out.println(b.getName());
		System.out.println(b.getPassword());
}
}
