package invntri;
//import java.lang.*;
public class Inventory{


Shape shapes[];
static int numberOfShapes;

	public Inventory(){System.out.println("Empty-Triangle");}
	
	public Inventory(int sizeOfInventory)
	{
	this.shapes = new Shape[sizeOfInventory];
	}
	public void insertShape(Shape s)
	{
		int flag = 0;
		for(int i=0; i<shapes.length; i++)
		{
			if(shapes[i] == null)
			{
				shapes[i] = s;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Inserted");}
		else {System.out.println("Can Not Insert");}
	}
	public void removeShape(Shape s)
	{
		int flag =0;
		for(int i=0; i<shapes.length; i++)
		{
			if(shapes[i] == a)
			{
				shapes[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("-----Removed-----");}
		else{System.out.println("-----CanNot Remove-----");}
	}
	
	public void showAllShapes()
	{
		for (int i=0; i<shapes.length; i++)
		{
			if(shapes[i] != null)
			{
				System.out.println("-----------------------");
				shapes[i].showDetails();
				System.out.println();
			}
		}
	}
	public void showShapesByType(String Type)
{                    //  inventory.numberOfShapes
	System.out.println("shape Number :"+numberOfShapes);
	for (int i=0; i<shapes.length; i++){
		if(shapes[i].getTypeofShape().equals("r")){
			((Rectangle) shapes[i]).showDetails();
		   }
	else if(shapes[i].getTypeofShape().equals("t")){
			((Triangle) shapes[i]).showDetails();
		   }
	else if(shapes[i].getTypeofShape().equals("c")){
		((Circle) shapes[i]).showDetails();
		   }
	
	}
}
}




