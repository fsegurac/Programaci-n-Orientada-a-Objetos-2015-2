
public final class StringOperations {

	
	//para que una clase sea utility class, primero debe llevar la Keyword final 
	//Constructor privado para que no pueda ser instanciado como objeto
	private StringOperations(){
	}
	
	//Metodo para saber si solo hay minusculas en un String, viene con el
	//modificador Static
	public static boolean Minus( String s ){
		String S = s.toLowerCase();
		if(S.equals(s)){
			return true;
		}else{
			return false;
		}	
	}
	
	//Metodo para saber si solo hay mayusculas en un String, viene con el
	//modificador Static
	public static boolean Mayus( String s ){
		String S = s.toUpperCase();
		if(S.equals(s)){
			return true;
		}else{
			return false;
		}	
	}
	
}
