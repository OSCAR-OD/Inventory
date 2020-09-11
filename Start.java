//package invntri;//for opening by cmd 
//first uncomment all import java.lang.*
// and for opening by any other Ide 
//first create a folder and a 
//package(with same folder name)
//import java.lang.*;

public class Start{  
	public static void main(String args[]){ 
	Shape r = new Rectangle(5.0,6.0);
	r.area();
	r.showDetails();
	/////////////////////
	Inventory i1= new Inventory(10);
		//Shape s = new Shape();
		//s.draw();
		Rectangle r1 = new Rectangle(1,2);
		 r1.setTypeofShape("r");
		//r.draw();
		Circle c1 = new Circle(1);
		//c.draw();
	 c1.setTypeofShape("c");
		Triangle t1 = new Triangle(1,2);
		//t.draw();
	 t1.setTypeofShape("t");
       i1.insertShape(r1);
       i1.insertShape(c1);
       i1.insertShape(t1);
       i1.insertShape(r1);
       i1.showAllShapes();
	/*	

		Shape Shapes[] = new Shape[5];
		
		Shapes[1] = c1;
		Shapes[2] = t1;
		Shapes[0] = r1;
	
		
		((Rectangle)Shapes[0]).showDetails();
		((Circle)Shapes[1]).showDetails();
		((Triangle)Shapes[2]).showDetails();
		
		for(int i=0;i<3;i++){
		if(Shapes[i].getTypeofShape().equals("r")){
		((Rectangle)Shapes[i]).showDetails();
			}
		else if(Shapes[i].getTypeofShape().equals("c")){
		((Circle)Shapes[i]).showDetails();
			}
	    	else if(Shapes[i].getTypeofShape().equals("t")){
				((Triangle)Shapes[i]).showDetails();
			}
		}
		
     */
	} 
   }
