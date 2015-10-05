package geometricShapesInheritance;

public abstract class Triangle {
	
	//Las subclases tienen en com˙n: el nombre de sus atributos y su valor por defecto, sus mÈtodos de acceso y el c·lculo del ·rea, asÌ que estas caracterÌsticas hacen parte de la superclase, difieren en el c·lculo del perÌmetro, asÌ que este ser· dado solo como un mÈtodo abstracto.
	
	protected double base = 1;
	protected double height = 1;
	
	public double getBase(){
	  return this.base;
	}
	
	public void setBase(double Base){
		  if(Base > 0.0){
			 this.base = Base; 
		  }else{
			 System.out.println("Valor no v·lido.");
		  }
	}
	
	//MÈtodo set correspondiente al atributo base, solo v·lido para valores mayores a 0.0
	
	public double getHeight(){
		  return this.height;
	}
	
	public void setHeight(double Height){
		  if(Height > 0.0){
			 this.height = Height; 
		  }else{
			 System.out.println("Valor no v·lido.");
		  }
	}
	
	//MÈtodo set correspondiente al atributo Height, solo v·lido para valores mayores a 0.0
	
	public double area(){
	      return (this.base*this.height)/2;
	}
	
	//Para todos los tipos de tri·ngulo definidos como subclases de Triangle, el valor del ·rea es el producto de la base por la altura, dividido entre 2
	
	public abstract double perimeter();
	
	//MÈtodo abstracto que todas las subclases deben tener definido, correspondiente al c·lculo del perÌmetro
	
}


