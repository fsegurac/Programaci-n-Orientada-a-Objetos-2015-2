package geometricShapesInheritance;

public class Rectangle extends Quadrilateral{

	public double perimeter(){
		return super.perimeter(this.lenght, this.width);
	}
	
	//La clase parallelogram define a lenght y a width, como los valores a usar para hallar el perÌmetro, seg˙n la definiciÛn del mÈtodo perimeter de su superclase
}
