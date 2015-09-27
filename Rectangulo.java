package rectangulo;

public class Rectangulo implements Area_Perimetro { //la clase rectangulo calculara el área y el perimetro, como atributos tendrá el largo y el ancho
                                                      //se emplea la interfaz Area_Perimetro tanto para calcular el area como el perimetro.
    private double largo;
    private double ancho;
    private double area;
    private double perimetro;

    public Rectangulo(double largo, double ancho) 
    {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getBase() 
    {
        return largo;
    }

    public void setLargo(double largo)
    {
       if (20>= largo && largo <= 0){               //se verifica que el numero este dentro del rango
       System.out.println("numero no valido ");
    }
        this.largo = largo;
    }

    public double getAltura() 
    {
        return ancho;
    }

    public void setAltura(double ancho)             //se verifica que el numero este dentro del rango
    {
        if (20>= ancho && largo <= 0){
       System.out.println("numero no valido ");
    }
        this.ancho = ancho;
    }

    public double getAreaRectangulo() 
    {
        return area;
    }

    @Override       //interfaz
    public void area() 
    {
        area = largo * ancho; //calculo del area de un rectangulo cualquiera
    }

    
    public double getPerimetroRectangulo() 
    {
        return perimetro;
    }

    @Override           //interfaz
    public void perimetro() 
    {
        perimetro = largo + largo + ancho + ancho; //calculo del perimetro de un rectangulo cualquiera
    }
        
}
