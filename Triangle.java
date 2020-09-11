package invntri;

//import java.lang.*;

public class Triangle extends Shape

{
	private double base;
   private double height;
		
	public Triangle(){System.out.println("Empty-Triangle");}
	public Triangle(double base, double height)
{	
		this.base = base;
		this.height = height;
		System.out.println("Parameterized-Triangle");
	}
	public double area(){
		return 0.5 * base * height;	   
	}
	public void showDetails(){
            System.out.println("Show Triangle area");
		System.out.println("Triangle area "+area());
			
	}
	}