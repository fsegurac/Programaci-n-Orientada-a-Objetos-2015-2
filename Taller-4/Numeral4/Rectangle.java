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
public class Rectangle extends Parallelogram{
    private String a,h,w;
    private Double area,width,height;
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

	public String getArea() {
		if (rectangleCondition()) {
			area= (getSouthEast().getX() - getSouthWest().getX()) * (getNorthWest().getY() - getSouthWest().getY());			                                                
		}
                a="Area of rectangle is: "+String.valueOf(area);
                return a;
	}

	public String getWidth() {
		if (rectangleCondition()) {
			width = getSouthEast().getX() - getSouthWest().getX();			                      
		}
                 w="Width of rectangle is: "+String.valueOf(width);
                 return w;
	}

	public String getHeight() {
		if(rectangleCondition()){
			height = getNorthWest().getY() - getSouthWest().getY();			                                            
		}
                h="Height of rectangle is: "+String.valueOf(height);
                        return h; 
	}
    
}
