package geometricShapesInheritance;

public class Parallelogram extends Quadrilateral{
	private double side = 1.5;
	
	//La subclase parallelogram tiene un atributo adicional que representa la longitud de dos de sus lados, necesarios para hallar el perÌmetro. La subclase por defecto representa un romboide de lados 1.5 y 1.0

	public double getSide(){
	  return this.side;
	}
	
	public void setSide(double Side){
		  if(Side > 0.0){
			 this.side = Side; 
		  }else{
			 System.out.println("Valor no v·lido.");
		  }
	}
	
	//MÈtodo set correspondiente al atributo side, solo v·lido para valores mayores a 0.0
	
	public double perimeter(){
	    return super.perimeter(this.side, this.width);
	}
	
	//La clase parallelogram define a side y a width, como los valores a usar para hallar el perÌmetro, seg˙n la definiciÛn del mÈtodo perimeter de su superclase
}
