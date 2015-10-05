package geometricShapesInheritance;

public class IsoscelesTriangle extends Triangle{
	
	public double perimeter(){
	      return this.base + 2*(Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2)));
	}
	
	//DefiniciÛn del mÈtodo abstracto perimeter para el tri·ngulo isÛsceles, se hallan los lados iguales y se suman con la base 
}
