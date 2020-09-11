package invntri;

//import import java.lang.*;

public class CStart
{
	public static void main(String args[])
	{
		Inventory c = new Inventory(10);
		
		Shape a1 = new Shape();
		a1.insertShape("rectangle");
		a1.setAccountNumber(1111);
		a1.setBalance(20000.0);
		
		
		c.addAccount(a1);
		c.showDetails();
		
		System.out.println("/////////////////////");
		
	}
}