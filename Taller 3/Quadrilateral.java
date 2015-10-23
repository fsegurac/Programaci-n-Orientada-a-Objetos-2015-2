
public class Quadrilateral {

	private Point southWest;
	private Point southEast;
	private Point northWest;
	private Point northEast;

	public Quadrilateral(Point southWest, Point southEast, Point northWest, Point northEast) {
		if (southEast.getX() < southWest.getX()) {
			this.southEast = southWest;
			southWest = southEast;
		} else {
			this.southEast = southEast;
		}
		if (northEast.getX() < northWest.getX()) {
			this.northEast = northWest;
			northWest = northEast;
		} else {
			this.northEast = northEast;
		}
		if (southEast.getY() > northEast.getY()) {
			this.southEast = northEast;
			northEast = southEast;
		} else {
			this.northWest = northWest;
		}
		if (southWest.getY() > northWest.getY()) {
			this.southWest = northWest;
			northWest = southWest;
		} else {
			this.southWest = southWest;
		}
	}

	public void getCoordinates() {
		System.out.println("( " + southWest.getX() + ", " + southWest.getY() + " )," + "( " + southEast.getX() + ", "
				+ southEast.getY() + " )," + "( " + northWest.getX() + ", " + northWest.getY() + " )," + "( "
				+ northEast.getX() + ", " + northEast.getY() + " )");
	}

	public Point getSouthWest() {
		return southWest;
	}

	public Point getSouthEast() {
		return southEast;
	}

	public Point getNorthWest() {
		return northWest;
	}

	public Point getNorthEast() {
		return northEast;
	}

}
