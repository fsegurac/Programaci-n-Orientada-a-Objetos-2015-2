
public class Square extends Rectangle {

	private double side;

	public Square(Point southWest, Point southEast, Point northWest, Point northEast) {
		super(southWest, southEast, northWest, northEast);
	}

	public void getSide() {
		if (getNorthWest().getY() - getSouthWest().getY() == getNorthEast().getX() - getNorthWest().getX()
				&& getSouthEast().getX() - getSouthWest().getX() == getNorthEast().getY() - getSouthEast().getY()) {
			side = getSouthEast().getX() - getSouthWest().getX();
			System.out.println("Side is: " + side);
		}else{
			System.out.println("not valid");
		}
	}
}
