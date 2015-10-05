
public class Trapezoid extends Quadrilateral {
	private double height;
	private double area;

	public Trapezoid(Point southWest, Point southEast, Point northWest, Point northEast) {
		super(southWest, southEast, northWest, northEast);
	}

	public void getArea() {
		area = (((getSouthEast().getX() - getSouthWest().getX()) + (getNorthEast().getX() - getNorthWest().getX()))
				* (getNorthWest().getY() - getSouthWest().getY())) / 2;
		System.out.println("Area is: " + area);
	}

	public void getHeight() {
		height = getNorthWest().getY() - getSouthWest().getY();
		System.out.println("Height is: " + height);
	}
}
