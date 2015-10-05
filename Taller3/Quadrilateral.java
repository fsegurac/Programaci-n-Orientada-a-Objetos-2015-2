package geometricShapesInheritance;

public abstract class Quadrilateral {
	
	//Las subclases tienen en com˙n: el nombre de sus atributos y su valor por defecto, sus mÈtodos de acceso y el c·lculo del ·rea, asÌ que estas caracterÌsticas hacen parte de la superclase, difieren parcialmente en el c·lculo del perÌmetro.
	
	protected double lenght = 1;
	protected double width = 1;
	
	public double getLenght(){
	  return this.lenght;
	}
	
	public void setLenght(double Lenght){
		  if(Lenght > 0.0){
			 this.lenght = Lenght; 
		  }else{
			 System.out.println("Valor no v·lido.");
		  }
	}
	
	//MÈtodo set correspondiente al atributo lenght, solo v·lido para valores mayores a 0.0
	
	public double getWidth(){
		  return this.width;
	}
	
	public void setWidth(double Width){
		  if(Width > 0.0){
			 this.width = Width; 
		  }else{
			 System.out.println("Valor no v·lido.");
		  }
	}
	
	//MÈtodo set correspondiente al atributo width, solo v·lido para valores mayores a 0.0
	
	public double area(){
	      return this.lenght * this.width;
	}
	
	//Para todas las subclases de Quadrilateral, el valor del ·rea es el producto del largo por el ancho
	
	public double perimeter( double a, double b ){
	     return 2*(a+b);
	}
	
	//Cada subclase de Quadrilateral define sus propios valores de a y b, los cuales usa el mÈtodo perimeter para hallar el valor del perÌmetro 
}
	

