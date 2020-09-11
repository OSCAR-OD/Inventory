package invntri;

//import java.lang.*;
public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle(){System.out.println("Empty-Rectangle");}
	public Rectangle(double length, double width)
	{	
		this.length = length;
		this.width = width;
		System.out.println("Parameterized-Rectangle");
	}
	
	public double area()
	{
		return length* width;
	
        }
	public void showDetails(){
		System.out.println("show Rectangle area");
            System.out.println("Rectangle area: "+area());
	
        }
	
}