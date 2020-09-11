package invntri;

//import java.lang.*;

public class Circle extends Shape
{
	private double Radius;
	public Circle(){System.out.println("Empty-Circle");}
	public Circle(double Radius)
	{
		this.Radius = Radius;
	System.out.println("Parameterized-Circle");
	}
	public double area()
	{
		return 3.1416 * Radius * Radius;
	
	}
	public void showDetails(){
		System.out.println("show Circle area");	
		System.out.println("Circle area: "+ area());
	}
   }
	