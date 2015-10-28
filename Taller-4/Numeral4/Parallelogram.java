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
public class Parallelogram extends Quadrilateral{
    
    private boolean yes = false;
	private double area;
	private double width;
	private double height;
        private String a,h,w;

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

	public String getArea() {
		if (parallelogramCondition()) {
			area = (getSouthEast().getX() - getSouthWest().getX()) * (getNorthWest().getY() - getSouthWest().getY());			                                                
		}
                a="Area of parallelogram is: "+String.valueOf(area);
                return a;
	}

	public String getWidth() {
		if (parallelogramCondition()) {
			width = getSouthEast().getX() - getSouthWest().getX();			                      
		}
                w="Width of parallelogram is: "+String.valueOf(width);
                 return w;
	}

	public String getHeight() {
		if (parallelogramCondition()) {
			height = getNorthWest().getY() - getSouthWest().getY();			                                            
		}
                h="Height of parallelogram is: "+String.valueOf(height);
                        return h; 
	}            
}
