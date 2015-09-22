package Ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {  

    //by @FabioSegura
    
	 public static boolean Revisar(CharSequence l, String palabra){
		  
         boolean rev;
         rev = palabra.contains(l);
         return rev;

         }
         
        public static void main(String[] args){
 
        	System.out.println("**JUEGO DEL AHORCADO**\n");
                Scanner user = new Scanner(System.in);
                Random ran = new Random();
                int r = ran.nextInt(8); 
                String palabra = "";
                int error = 0;
                int faltan=5;
                String letra = "";
                char l;
 
                switch(r){

                case 1: palabra = "programacion";
                break;
 
                case 2: palabra = "ahorcado";
                break;

                case 3: palabra = "universidad"; 
                break;
 
                case 4: palabra = "ingenieria";
                break;
 
                case 5: palabra = "bogota";
                break;
                    
                case 6: palabra = "metodo";
                break;
                
                case 7: palabra = "clase";
                break;
                    
                case 8: palabra = "java";
                break;
                    
                }
 
  
  
                 char []secreta = palabra.toCharArray();
                 int aciertos=0;
                 System.out.println("El tamaño de la palabra es: " + palabra.length());
                 char []aux=new char[palabra.length()];
                 for (int i=0;i<palabra.length();i++){
  
                         aux[i]='_';
                 }
  
                 while(error != 5){
                	     
                	     
                         for (int i=0;i<palabra.length();i++)
                         System.out.print(aux[i]); 
                         System.out.println("\nIngrese una letra" + ", Errores:"+ error + ", Quedan:"+faltan);
                         
                         letra=user.next();                     
                         l=letra.toCharArray()[0];
                         
  
                         if(Revisar(letra, palabra)){
  
  
                                 for (int i=0;i<palabra.length();i++){
  
                                         if(secreta[i]==l)
  
                                         {
                                                 aciertos++;
                                                 aux[i]=l; 
                                         }
  
                                 }
  
                            }else{
  
                                 error++;
                                 faltan--;
  
                                 if(error == 5){
  
                                         System.out.println("¡¡PERDISTE!! La palabra era: "+palabra);  
                                         break;
                                   }
                        }
 
 
                        if(aciertos == palabra.length()){
 
                                System.out.println("¡¡Ganaste!! La palabra era: " + palabra); 
                                break;
                        }
                }
        }
}

