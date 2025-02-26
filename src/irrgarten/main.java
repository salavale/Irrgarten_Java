/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author usuario
 */

//Este numerado representa las direcciones en que se puede mover el jugador por
//el laberinto
enum Directions {LEFT, RIGHT, UP, DOWN}

//Representa los dos tipos de desplazamientos existentes en el juego
enum Orientation {VERTICAL, HORIZONTAL}


//Representa a los dos tipos de personajes del juego
enum GameCharacter {PLAYER, MONSTER}

public class Weapon {
    
 private float power;
 private int uses;

    public Weapon(float p, int u){
        power=p;
        uses=u;
    }
    
    float attack(){
        if(uses>0){
            return power;
            this.uses--;
        }else return 0;
    }
    public String toString (){
        return "W["+;
    }
}

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Clase");
    }
    
}
