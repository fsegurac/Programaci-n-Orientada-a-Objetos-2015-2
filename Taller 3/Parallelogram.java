
public class Parallelogram extends Quadrilateral {
	private boolean yes = false;
	private double area;
	private double width;
	private double height;

	public Parallelogram(Point southWest, Point southEast, Point northWest, Point northEast) {
		super(southWest, southEast, northWest, northEast);
	}

	private boolean parallelogramCondition() {
		if (((getNorthEast().getX() - getNorthWest().getX()) + (getSouthEast().getX() - getSouthWest().getX()))
				/ 2 == getSouthEast().getX() - getSouthWest().getX()) {
			yes = true;
		}
		return yes;
	}

	public void getArea() {
		if (parallelogramCondition()) {
			area = (getSouthEast().getX() - getSouthWest().getX()) * (getNorthWest().getY() - getSouthWest().getY());
			System.out.println("Area is: " + area);
		}
	}

	public void getWidth() {
		if (parallelogramCondition()) {
			width = getSouthEast().getX() - getSouthWest().getX();
			System.out.println("Width is: " + width);
		}
	}

	public void getHeight() {
		if (parallelogramCondition()) {
			height = getNorthWest().getY() - getSouthWest().getY();
			System.out.println("Height is: " + height);
		}
	}
}
