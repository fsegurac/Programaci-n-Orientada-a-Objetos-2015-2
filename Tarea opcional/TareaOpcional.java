
package TareaOpcional;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author Chesito!!!
 */
public class TareaOpcional {
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inicioDot ="cambiar coma por punto:";
		
		System.out.println(inicioDot.toUpperCase()+"\n");
		dotOrComma();

	}
	
	private static void dotOrComma(){
		
		double a;
		
		/*Se pide el numero al usuario*/
		
		Scanner num=new Scanner(System.in);
		System.out.println("*Por favor ingrese su numero (Ej: 0,0001):\n");
		a=num.nextDouble();
		
		/*Se procesa el numero y se hace el cambio de coma por punto*/
		DecimalFormatSymbols symbol=new DecimalFormatSymbols();
		symbol.setDecimalSeparator('.');
		DecimalFormat change=new DecimalFormat("########.########",symbol);

		//Se imprime el nuevo número
		System.out.println("\n*Este es su nuevo número:");
		System.out.println(change.format(a));
				
	}	 
}




