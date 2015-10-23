
public class Rectangle extends Parallelogram {
	private boolean yes = false;

	public Rectangle(Point southWest, Point southEast, Point northWest, Point northEast) {
		super(southWest, southEast, northWest, northEast);
	}

	private boolean rectangleCondition() {
		if (getNorthWest().getX() == getSouthWest().getX() && getNorthEast().getX() == getSouthEast().getX()) {
			yes = true;
		}
		return yes;
	}

	public void getArea() {
		if (rectangleCondition()) {
			super.getArea();
		}
	}

	public void getWidth() {
		if (rectangleCondition()) {
			super.getWidth();
		}
	}

	public void getHeight() {
		if(rectangleCondition()){
			super.getHeight();
		}
	}
}
