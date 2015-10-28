/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller4;

/**
 *
 * @author Chesito!!!
 */
public class Quadrilateral extends BasicMeasures{
    
    
    private Point southWest;
    private Point southEast; 
    private Point northWest;
    private Point northEast;
    private String u = ("Undefined");
    
  
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
        
        public String getWidth(){
            return u;
        }
        
        public String getArea(){
            return u;
        }
        
        public String getHeight(){
            return u;
        }
    
}
