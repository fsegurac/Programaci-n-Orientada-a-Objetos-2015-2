/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Chesito!!!
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Array donde se guardarán las medidas
        ArrayList <String> Measures = new ArrayList<String>();
        String m;
        //Puntos para construir las figuras
                Point qua1 = new Point(2.1, 2.2);
		Point qua2 = new Point(5.6, 3.8);
		Point qua3 = new Point(7.2, 10.9);
		Point qua4 = new Point(1.2, 6.4);
		Point tra1 = new Point(1.0, 1.0);
		Point tra2 = new Point(9.0, 0.0);
		Point tra3 = new Point(9.0, 6.0);
		Point tra4 = new Point(4.3, 5.5);
		Point par1 = new Point(5.0, 5.8);
		Point par2 = new Point(11.0, 5.03);
		Point par3 = new Point(12.0, 20.0);
		Point par4 = new Point(6.0, 20.09);
		Point rec1 = new Point(17.0, 14.4);
		Point rec2 = new Point(30.05, 14.4);
		Point rec3 = new Point(30.05, 28.0);
		Point rec4 = new Point(17.0, 28.0);
		Point squ1 = new Point(4.0, 0.0);
		Point squ2 = new Point(8.0, 0.0);
		Point squ3 = new Point(8.0, 4.0);
		Point squ4 = new Point(4.0, 4.0);
		
                System.out.println("Coordinates of Quadrilateral are:");
		Quadrilateral qua = new Quadrilateral(qua1, qua2, qua3, qua4);
		qua.getCoordinates();
		
                System.out.println("\nCoordinates of trapezoid are:");
		Trapezoid tra = new Trapezoid(tra1, tra2, tra3, tra4);
		tra.getCoordinates();
		Measures.add(tra.getHeight());
		Measures.add(tra.getArea());
		
                System.out.println("\nCoordinates of parallelogram are:");
		Parallelogram par = new Parallelogram(par1, par2, par3, par4);
		par.getCoordinates();
		Measures.add(par.getWidth());
		Measures.add(par.getHeight());
		Measures.add(par.getArea());
		
                System.out.println("\nCoordinates of rectangle are:");
		Rectangle rec = new Rectangle(rec1, rec2, rec3, rec4);
		rec.getCoordinates();
		Measures.add(rec.getWidth());
		Measures.add(rec.getHeight());
		Measures.add(rec.getArea());
		
                System.out.println("\nCoordinates of square are:");
		Square squ = new Square(squ1, squ2, squ3, squ4);
		squ.getCoordinates();
		Measures.add(squ.getSide());
		Measures.add(squ.getArea());
                
                Iterator<String> Iterator = Measures.iterator();
                while(Iterator.hasNext()){
	        String elemento = Iterator.next();
	        System.out.print("\n"+elemento+"\n");
                }

	
    }
    
}
