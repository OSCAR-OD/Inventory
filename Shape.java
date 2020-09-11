package invntri;
//import java.lang.*;

public abstract class Shape{

public String typeOfShape;
public void setTypeofShape(String typeOfShape)
{
	this.typeOfShape = typeOfShape;
}
String getTypeofShape()
{
	return this.typeOfShape;
}

public abstract double area();

public abstract void showDetails();

}