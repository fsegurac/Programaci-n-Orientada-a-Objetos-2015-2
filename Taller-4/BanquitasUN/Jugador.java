/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banquitasun;

public class Jugador {

    //info jugadores
    String nombre;
    String posicion;//de juego, solo para info
    int edad;
    int camiseta;//numero de la camiseta/jugador
    int goles; //goles anotados
    int habilidades; //numero de habliddes del jugador
       
    
    public String getNombre(){
		return nombre;
	}
    public void setNombre(String nombre){
		this.nombre=nombre;
        } 
    public String getPosicion(){
		return posicion;
	}
    public void setPosicion(String posicion){
		this.posicion=posicion;
	}
    public int getEdad(){
		return edad;
	}
    public void setEdad(int edad){
		this.edad=edad;
	}
    public int getCamiseta(){
		return camiseta;
	}
    public void setCamiseta(int camiseta){
		this.camiseta=camiseta;
	}
    public int getGoles(){
		return goles;
	}
    public void setGoles(int goles){
		this.goles=goles;
	}
    public int getHabilidades(){
		return habilidades;
	}
    public void setHabilidades(int habilidades){
		this.hablidades=habilidades;
                
    
public void infoJugadores(){
		
        System.out.println("/nEl nombre del jugador: "+ nombre);
        
	System.out.println("Edad: "+ edad);
        
	System.out.println("Juega como: "+ posicion);
        
	System.out.println("El jugador tiene: "+ habilidades " habilidades ");
	
	}
	
	Jugador (String nombre, int edad, int camiseta,int goles){

 }
  //this.nombre= nombre;
  //this.edad=edad;
	//this.camiseta= camiseta;
	//this.goles= goles;
		
	}
}
