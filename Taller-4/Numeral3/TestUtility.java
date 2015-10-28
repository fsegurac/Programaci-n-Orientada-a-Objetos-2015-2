import java.util.*;


public class TestUtility {

	public static void main(String[] args) {
		
		//String que se leera y boolean para asignarsele el valor
		//resultante de un metodo de la Utility Class
		String s;
		boolean m = false;
		Scanner sc = new Scanner( System.in );
		
		System.out.println("Escriba un String para determinar si las"
				            +" letras que contiene son solo mayusculas: ");
		
		//leer el String
		s = sc.nextLine();
		
		//Usando el metodo de la Utility Class StringOperations
		m = StringOperations.Mayus(s);
		
		if(m){
			System.out.println("No hay letras minusculas en el String");
		}else{
			System.out.println("Hay letras minusculas en el String");
		}
	}

}
