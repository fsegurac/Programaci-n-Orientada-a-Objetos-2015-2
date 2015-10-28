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
public class Trapezoid extends Quadrilateral{
    
    private double height;
    private double area;

	public Trapezoid(Point southWest, Point southEast, Point northWest, Point northEast) {
		super(southWest, southEast, northWest, northEast);
	}

	public String getArea() {
		area = (((getSouthEast().getX() - getSouthWest().getX()) + (getNorthEast().getX() - getNorthWest().getX()))
				* (getNorthWest().getY() - getSouthWest().getY())) / 2;
		String a="Area of trapezoid is: "+String.valueOf(area);
                return a;
              
	}

	public String getHeight() {
		height = getNorthWest().getY() - getSouthWest().getY();
		String h="Heigth of trapezoid is: "+String.valueOf(height);
                return h;
	}
        
        
}
