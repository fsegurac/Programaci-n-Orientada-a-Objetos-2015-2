import java.util.Calendar;


public class Main {

	private static void imprimirEjemploConEnteros(){
		int numero = 1992;
		System.out.format("Imprimir Entero: %d\n", numero);
		System.out.format("Imprimir Entero positivo: %d\n", +numero);
		System.out.format("Imprimir Entero negativo: %d\n", -numero);
		System.out.format("Imprimir Entero en octal: %o\n", numero);
		System.out.format("Imprimir Entero en Hexadecimal: %x\n", numero);
		System.out.format("Imprimir Entero en Hexadecimal: %X\n", numero);
		//Y para imprimir en binario %s??
		//%s imprime un string
		System.out.format("Imprimir Entero en Binario: %s\n", Integer.toBinaryString(numero));
		
		
		System.out.format("\n\n");
		System.out.format("Imprimir Justificado: %4d\n", 1);
		System.out.format("Imprimir Justificado: %4d\n", 12);
		System.out.format("Imprimir Justificado: %4d\n", 123);
		System.out.format("Imprimir Justificado: %4d\n", 1234);
		System.out.format("Imprimir Justificado: %4d\n", 12345);
		System.out.format("Imprimir Justificado completado con ceros: %09d\n", 12345);
	}
	
	private static void imprimirEjemploConReales(){
		double numero = 12345678.9;
		
		System.out.format("Imprimir Numero Real: %f\n", numero);
		System.out.format("Imprimir Numero Real en notacion exponencial: %e\n", numero);
		System.out.format("Imprimir Numero Real en notacion exponencial: %E\n", numero);
		System.out.format("Imprimir Numero Real en hexadecimal: %A\n", numero);
		
		System.out.format("\n\n");
		System.out.format("Imprimir Numero real usando precision: %.3f\n", numero);
		System.out.format("Imprimir Numero real usando precision: %.3e\n", numero);
	}
	
	private static void imprimirEjemploConStrings(){
		char letra = 'a';
		String string = "Mi String";
		int numero = 12345;
		
		System.out.format("Imprimiendo caracter %c\n", letra);
		System.out.format("Imprimiendo string %s\n", string);
		System.out.format("Imprimiendo String con Mayusculas %S\n", string);
		System.out.format("Imprimiendo entero como String %S\n", numero);
		
		System.out.format("Imprimiendo String con Precision %.6s\n", string);
		System.out.format("Imprimiendo String Uando Justificacion a la Izquierda %10s%10d%10c\n", string, numero, letra);
	}
	
	private static void imprimirEjemploFechaYHora(){
		Calendar dataTime = Calendar.getInstance();
		
		System.out.format("Imprimiendo Fecha: %tc\n", dataTime);
		System.out.format("Imprimiendo Fecha en formato yyyy-mm-dd: %tF\n", dataTime);
		System.out.format("Imprimiendo Fecha en formato dd/mm/yy: %tD\n", dataTime);
		System.out.format("Imprimiendo hora en formato 12 horas: %tr\n", dataTime);
		System.out.format("Imprimiendo hora en formato 24 horas: %tT\n", dataTime);
	}

	private static void stringMiscellaneous(){
		String string = "Hello strings world!!!";
		System.out.println("Longitud del string: "+string.length() );
		System.out.println("Substring desde la posicion 6"+ string.substring(6));
		System.out.println("Substring desde la posicion 0 a la 6"+ string.substring(0, 6));
		System.out.println("String en Mayuscula"+ string.toUpperCase() );
		System.out.println("String en Minuscula"+ string.toLowerCase() );
		System.out.println("Caracter en la posicion 7:"+ string.charAt(7) );
		System.out.println("Posicion de la palabra \"string\" es: "+ string.indexOf("string"));
		System.out.println("Posicion del caracter 'w' es: "+ string.indexOf('w'));
		System.out.println("Posicion del caracter 'W' es: "+ string.indexOf('W'));
		System.out.println("El string esta vacio?"+ string.isEmpty() );
		System.out.println("Comparar Strings "+ string.equals("Nuevo String") );
		System.out.println("Comparar Strings "+ string.equals("Hello strings world!!!") );
	}
	
	public static void main(String[] args) {
		System.out.println("Ejemplo con Numero enteros:");
		imprimirEjemploConEnteros();
		System.out.println("\n\nEjemplo con Numeros Reales:");
		imprimirEjemploConReales();
		System.out.println("\n\nEjemplo con Numeros String:");
		imprimirEjemploConStrings();
		System.out.println("\n\nEjemplo con Fechas:");
		imprimirEjemploFechaYHora();
		System.out.println("\n\nStrings:");
		stringMiscellaneous();
	}

}
