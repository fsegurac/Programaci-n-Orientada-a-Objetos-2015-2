
package banquitasun;

import java.util.Scanner;

public class Campeonato {
    
    private static Scanner in = new Scanner(System.in);
    public static void main( String ... args ) {
        int numeroEquipos = readInt("Escriba el numero de equipos que participan en BanquitasUN: ");
        Equipo [] equipos = new Equipo[numeroEquipos];
        for ( int i = 0 ; i < numeroEquipos ; i++ ) {
            equipos[i] = Equipo.creaEquipo(
                readString("\n\nNombre del equipo: "), 
                readInt("Partidos jugados: "), 
                readInt("Partidos ganados: "), 
                readInt("Empates: "), 
                readInt("Partidos perdidos: "), 
                readInt("Goles a favor: "), 
                readInt("Goles en contra: "));
        }
        for ( Equipo e : equipos ) {
            out.println( e );
        }
    }
    private static String readString( String message ) {
        System.out.print( message );
        return in.next();
    } 
    private static int readInt(String message) {
        System.out.print(message);
        return in.nextInt();
    }
}
