import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) throws Exception {
		compareLetters();
	}

	public static void compareLetters() throws Exception {
		// lo que hacen las siguientes dos lineas es leer desde un archivo de
		// texto externo un lista de palabras que seran utilizadas para el juego
		System.setIn(new FileInputStream(new File("input.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// el while determina si hay lineas por leer en el archivo de texto
		while (br.ready()) {
			// input es una variable de tipo string a la que se le va asignando
			// la palabra leida
			input = br.readLine();
			// words es una arraylist de tipo string a la que se le van
			// agregando secuencialmente las palabras que guarda input
			words.add(input);
		}
		// word es un variable de tipo string a la que se le asigna una palabra
		// al azar, con ayuda de la funcion random asignado a la varible rd, de
		// la lista de palabras de words. nextInt(words.size()) garantiza que el
		// rango del entero asignado a una de las posiciones de words no se
		// exceda de la dimension del respectivo arraylist
		word = words.get(rd.nextInt(words.size()));
		arr = new char[word.length()];
		solution = new char[word.length()];
		// el formato para representar los errores en el presente juego es con
		// con el codigo q(X_X)P, asi que para un arreglo de tipo char llamado
		// charerr se le asignan, en una posicion conocida, esta notacion
		charerr[0] = 'q';
		charerr[1] = '(';
		charerr[2] = 'X';
		charerr[3] = '_';
		charerr[4] = 'X';
		charerr[5] = ')';
		charerr[6] = 'P';
		// el siguiente for trabaja mientras el entero i sea menor a la
		// dimension de la palabra word
		for (int i = 0; i < word.length(); i++) {
			// arr es un arreglo de tipo char al que se le asigna por posicion
			// cada letra de la palabra guardada en word. charAt(i) permite
			// acceder a cada letra de word y hacer el respectivo casting para
			// que sea posible su asignacion
			arr[i] = word.charAt(i);
			// solution es un arreglo de tipo char en el cual se dispondran las
			// letras que sean descubiertas durante el juego, en este caso se
			// rellena provisionalmente del simbolo - por convencion y para ser
			// una ayuda visual del tamaño de la palabra a descubrir
			solution[i] = '-';
		}
		// en esencia el siguinte do permite la operacion del juego hasta que se
		// cometa una cierta cantidad de errores, en este caso 7, dada por el
		// arraylist errors
		do {
			// letter es una variable de tipo string a la cual se le va ser
			// asignada la letra con la que se va a jugar, es decir, se ingresa
			// desde consola por el usuario.
			letter = sc.nextLine();
			// ya que es un juego hecho para que el usuario descubra una palabra
			// letra por letra se hace necesario controlar lo que el usuario
			// ingresa, por lo tanto el if determina si esto se esta cumpliendo,
			// si el tamaño del string letter es mayor a uno, entonces muestra
			// un mensaje de error y reinicia el bucle con ayuda de la palabra
			// reservada "continue"
			if (letter.length() > 1) {
				System.err.println("Entrada no valida");
				continue;
			}
			// arrletter es un arreglo tipo char de dimension uno al que se le
			// asigna la letra guardada en el string letter
			arrletter[index] = letter.charAt(0);
			// uletters es un arraylist al que se le van agregando las letras
			// que han sido usadas
			uletters.add(arrletter[index]);
			// la iteracion del for se hace para poder comparar todas posiciones
			// de los arreglos
			for (int i = 0; i < word.length(); i++) {
				// la condicion del if en union con el for permite comparar la
				// letra que hay en el arreglo arrletter con cada posicion del
				// arreglo arr
				if (arrletter[index] == arr[i]) {
					// si se cumple la condicion, al arreglo solution se le
					// asigna la letra con la que coincidieron los arreglos
					// arrletter y arr, en la posicion en la que estos
					// coincidieron, permitiendo que la palabra se descubra en
					// orden.
					solution[i] = arr[i];
					// yes es una variable de tipo booleano a la cual
					// inicialmente se le asigna el valor de false,
					// posteriormente permitira controlar la impresion en
					// consola
					yes = true;
				} else {
					// se hace necesario asignar explicitamente el valor false
					// en la variable yes para evitar conflictos en el siguiente
					// bucle
					yes = false;
				}
			}
			for (int i = 0; i < word.length(); i++) {
				// el for en combinacion con el if permite comparar cada
				// posicion de los arreglos arrletter y arr, en este caso la
				// condicion nos indica que si son diferentes, se haga que la
				// variable de tipo entero counter aumente en uno, sabiendo que
				// su valor inicial es cero
				if (arrletter[index] != arr[i]) {
					counterr++;
				}
			}
			// ya que chararr tiene la convencion para los errores en su
			// interior se hace necesaria una iteracion para ir cambiando su
			// posicion
			// la condicion del if indica que si el entero counter tiene el
			// mismo valor que la dimension del string word se agregara un valor
			// al arraylist errors
			if (counterr == word.length()) {
				// errors es una arraylist de tipo string al que se le van
				// asignando las convenciones del error para luego ser mostradas
				// en consola
				errors.add(charerr[n]);
				n++;
			}
			// counter se debe reiniciar en cero para poder ser utilizado en la
			// siguiente iteracion
			counterr = 0;
			// El if permite controlar la impresion en consola de la soluciony
			// de todos las convenciones descitas para el juego guardas
			// respectivamente en el arreglo solution y los arraylist errors y
			// uletters
			if (yes) {
				for (int i = 0; i < solution.length; i++) {
					System.out.print(solution[i]);
				}
				System.out.print("\t\t\t" + errors + "\t\t\t" + uletters);
			} else if (!yes) {
				for (int i = 0; i < solution.length; i++) {
					System.out.print(solution[i]);
				}

				System.out.print("\t\t\t" + errors + "\t\t\t" + uletters);
			}
			//
			for (int i = 0; i < word.length(); i++) {
				if (solution[i] == arr[i]) {
					count++;
				}
			}
			count = count - fix;
			fix = count;
			// la condicion del if indica que cuando el entero count sea igual a
			// la dimension del string word permite el ingreso a su declaracion
			if (count == word.length()) {
				// win es una variable de tipo booleano que esta inicializado en
				// false
				win = true;
			}
			// si el booleano win tiene asignado true se muestra un mensaje en
			// consola indicandole al usuario que ha ganado el juego
			if (win) {
				System.out.println("\nYou Win!!!");
				// System.exit(0) termina la ejecucion del programa
				System.exit(0);
			}
		} while (errors.size() < 7);
		// el juego se pierde si el tamaño del arraylist errors llega a ser
		// igual a siete, lo cual se evidencia con una impresion en consola
		// mostrando el mensaje por convencion de la derrota mas la palabra a
		// resolver
		if (errors.size() == 7) {
			System.out.println("\nYou Lose!!! The secret word is: " + word);
			System.exit(0);
		}

	}

	static int n = 0;
	static int count = 0;
	static int counterr = 0;
	static int fix = 0;
	static boolean win;
	static Scanner sc = new Scanner(System.in);
	static String input;
	static String word;
	static String letter;
	private static final int index = 0;
	static char[] arrletter = new char[1];
	static char[] arr;
	static char[] solution;
	static char[] charerr = new char[7];
	static ArrayList<String> words = new ArrayList<>();
	static ArrayList<Character> uletters = new ArrayList<Character>();
	static ArrayList<Character> errors = new ArrayList<Character>();
	static Random rd = new Random();
	static boolean yes = false;
}
