
public class TestQuadrilateral {

	public static void main(String[] args) {
		
		Point qua1 = new Point(1.1, 1.2);
		Point qua2 = new Point(6.6, 2.8);
		Point qua3 = new Point(6.2, 9.9);
		Point qua4 = new Point(2.2, 7.4);
		Point tra1 = new Point(0.0, 0.0);
		Point tra2 = new Point(10.0, 0.0);
		Point tra3 = new Point(8.0, 5.0);
		Point tra4 = new Point(3.3, 5.0);
		Point par1 = new Point(5.0, 5.0);
		Point par2 = new Point(11.0, 5.0);
		Point par3 = new Point(12.0, 20.0);
		Point par4 = new Point(6.0, 20.0);
		Point rec1 = new Point(17.0, 14.0);
		Point rec2 = new Point(30.0, 14.0);
		Point rec3 = new Point(30.0, 28.0);
		Point rec4 = new Point(17.0, 28.0);
		Point squ1 = new Point(4.0, 0.0);
		Point squ2 = new Point(8.0, 0.0);
		Point squ3 = new Point(8.0, 4.0);
		Point squ4 = new Point(4.0, 4.0);
		System.out.println("Coordinates of Quadrilateral are:");
		Quadrilateral qua = new Quadrilateral(qua1, qua2, qua3, qua4);
		qua.getCoordinates();
		System.out.println("\nCoordinates of trapezoid are:");
		Trapezoid tra = new Trapezoid(tra1, tra2, tra3, tra4);
		tra.getCoordinates();
		tra.getHeight();
		tra.getArea();
		System.out.println("\nCoordinates of parallelogram are:");
		Parallelogram par = new Parallelogram(par1, par2, par3, par4);
		par.getCoordinates();
		par.getWidth();
		par.getHeight();
		par.getArea();
		System.out.println("\nCoordinates of rectangle are:");
		Rectangle rec = new Rectangle(rec1, rec2, rec3, rec4);
		rec.getCoordinates();
		rec.getWidth();
		rec.getHeight();
		rec.getArea();
		System.out.println("\nCoordinates of square are:");
		Square squ = new Square(squ1, squ2, squ3, squ4);
		squ.getCoordinates();
		squ.getSide();
		squ.getArea();

	}

}
