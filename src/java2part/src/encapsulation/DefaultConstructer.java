package encapsulation;



class Bankkkkkk123
{
	private int bal;
	private String name;
	private int password;
                                       // ekkada costructer jvm esthundhi default values
	
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



public class DefaultConstructer {
	public static void main(String[] args) {
		Bankkkkkk123 b =new Bankkkkkk123();   // default constructer parameterr constructer
		 System.out.println(b.getBal());
			System.out.println(b.getName());
			System.out.println(b.getPassword());
		
	}

}
