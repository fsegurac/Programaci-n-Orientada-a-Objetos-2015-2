package geometricShapesInheritance;

public class TestShapes {

	public static void main(String[] args) {
		
		
		RectangleTriangle Rt = new RectangleTriangle();
		IsoscelesTriangle It = new IsoscelesTriangle();
		Parallelogram Pg = new Parallelogram();
		Rectangle Rg = new Rectangle();
		
		Rt.setBase(3.0);
		Rt.setHeight(4.0);
		
		//Tri·ngulo rect·ngulo de base 3.0 y altura 4.0
		
		It.setBase(6.0);
		It.setHeight(2.0);
		
		//Tri·ngulo isÛsceles de base 6.0 y altura 2.0
		
		Pg.setSide(4.5);
		Pg.setWidth(4.0);
		
		//Paralelogramo de ancho 4.0, lado de 4.5 y largo por defecto: 1.0
		
		Rg.setLenght(-3.0);
		
		//Valor no v·lido para establecer el largo del rect·ngulo, se mantiene en el valor por defecto
		
		System.out.println("The perimeter of the rectangle triangle is: " +Rt.perimeter());
		System.out.println("The area of the rectangle triangle is: " +Rt.area());
		
		System.out.println("The perimeter of the isosceles triangle is: " +It.perimeter());
		System.out.println("The area of the isosceles triangle is: " +It.area());
		
		System.out.println("The perimeter of the paralellogram is: " +Pg.perimeter());
		System.out.println("The area of the paralellogram is: " +Pg.area());
		
		System.out.println("The perimeter of the rectangle is: " +Rg.perimeter());
		System.out.println("The area of the rectangle is: " +Rg.area());
		
		
    }
}
