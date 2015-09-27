
package rectangulo;

public class Main {
    
    public static void main(String[] args) // a continuacion se declaran los direcentes rectangulos y se aplican los calculos.
    {
        
        System.out.println("      *** AREA Y PERIMETRO DE RECTANGULOS ***   ");
    
    Rectangulo rectangulo = new Rectangulo(1,1);
        rectangulo.area();
        System.out.println("    Área del rectángulo de base 1 y altura 1: " + rectangulo.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 1 y altura 1: " + rectangulo.getPerimetroRectangulo());        
        
    Rectangulo rectangulo1 = new Rectangulo(15, 11);
        rectangulo1.area();
        rectangulo1.perimetro();
        System.out.println("1-  Área del rectángulo de base 15 y altura 11: " + rectangulo1.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 15 y altura 11: " + rectangulo1.getPerimetroRectangulo());         
        
    Rectangulo rectangulo2 = new Rectangulo(1, 14);
        rectangulo2.area();
        rectangulo2.perimetro();
        System.out.println("2-  Área del rectángulo de base 1 y altura 14: " + rectangulo2.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 1 y altura 14: " + rectangulo2.getPerimetroRectangulo());
        
    Rectangulo rectangulo3 = new Rectangulo(16, 9);
        rectangulo3.area();
        rectangulo3.perimetro();
        System.out.println("3-  Área del rectángulo de base 16 y altura 9: " + rectangulo3.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 16 y altura 9: " + rectangulo3.getPerimetroRectangulo());   
        
    Rectangulo rectangulo4 = new Rectangulo(4, 8);
        rectangulo4.area();
        rectangulo4.perimetro();
        System.out.println("4-  Área del rectángulo de base 4 y altura 8: " + rectangulo4.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 4 y altura 8: " + rectangulo4.getPerimetroRectangulo());
        
    Rectangulo rectangulo5 = new Rectangulo(10, 16);
        rectangulo5.area();
        rectangulo5.perimetro();
        System.out.println("5-  Área del rectángulo de base 10 y altura 16: " + rectangulo5.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 10 y altura 16: " + rectangulo5.getPerimetroRectangulo());
        
    Rectangulo rectangulo6 = new Rectangulo(20, 100);
        rectangulo6.area();
        rectangulo6.perimetro();
        System.out.println("6-  Área del rectángulo de base 20 y altura 10: " + rectangulo6.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 20 y altura 10: " + rectangulo6.getPerimetroRectangulo());   
        
    Rectangulo rectangulo7 = new Rectangulo(1, 3);
        rectangulo7.area();
        rectangulo7.perimetro();
        System.out.println("7-  Área del rectángulo de base 1 y altura 3: " + rectangulo7.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 1 y altura 3: " + rectangulo7.getPerimetroRectangulo());
        
    Rectangulo rectangulo8 = new Rectangulo(6, 16);
        rectangulo8.area();
        rectangulo8.perimetro();
        System.out.println("8-  Área del rectángulo de base 6 y altura 16: " + rectangulo8.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 6 y altura 16: " + rectangulo8.getPerimetroRectangulo());
        
    Rectangulo rectangulo9 = new Rectangulo(12, 4);
        rectangulo9.area();
        rectangulo9.perimetro();
        System.out.println("9-  Área del rectángulo de base 12 y altura 4: " + rectangulo9.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 12 y altura 4: " + rectangulo9.getPerimetroRectangulo());
        
    Rectangulo rectangulo10 = new Rectangulo(10, 10);
        rectangulo10.area();
        rectangulo10.perimetro();
        System.out.println("10- Área del rectángulo de base 10 y altura 10: " + rectangulo10.getAreaRectangulo());
        System.out.println("    Perimetro del rectángulo de base 10 y altura 10: " + rectangulo10.getPerimetroRectangulo());
        
    
}
}
