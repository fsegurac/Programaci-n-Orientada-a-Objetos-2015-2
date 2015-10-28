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
public class Square extends Rectangle{
    
    private double side,area;
    private String s,a;

	public Square(Point southWest, Point southEast, Point northWest, Point northEast) {
		super(southWest, southEast, northWest, northEast);
	}

	public String getSide() {
		if (getNorthWest().getY() - getSouthWest().getY() == getNorthEast().getX() - getNorthWest().getX()
				&& getSouthEast().getX() - getSouthWest().getX() == getNorthEast().getY() - getSouthEast().getY()) {
			side = getSouthEast().getX() - getSouthWest().getX();			
		}else{
			System.out.println("not valid");
		}
                s="Side of square is: "+String.valueOf(side);
                return s;        
        }
        
        public String getArea(){
         area=side*side;
         a="Area of square is: "+area;
         return a;
        }
}
    

