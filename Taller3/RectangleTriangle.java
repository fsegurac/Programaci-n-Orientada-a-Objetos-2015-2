package geometricShapesInheritance;

public class RectangleTriangle extends Triangle{
	
	public double perimeter(){
	      return this.base + this.height + Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2));
	}
	
	//DefiniciÛn del mÈtodo abstracto perimeter para el tri·ngulo rect·ngulo, se halla la hipotenusa y se suma con la base y la altura
}
