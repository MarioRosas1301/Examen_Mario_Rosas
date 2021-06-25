
package test;

import dominio.Examen;
import java.util.Scanner;

public class testExamen {
    static Scanner coordenadas = new Scanner(System.in);
    public static void main(String [] args){
         System.out.println("Cuantas coordenadas desea saber: ");
        int n = coordenadas.nextInt();
        Examen [] exa  = new Examen [n];
        puntoInicial(exa);
        numeroRandom(exa);
        System.out.println("------------------------------------------------------");
        
    }
    public static void puntoInicial(Examen ex []){
        int punto=0 ;
        System.out.println("Las coordenadas en el punto inicial es: "+punto+","+punto);
    }
    
    public static int numeroRandom(Examen ex []){
    for(int i=0; i<ex.length;i++){
        System.out.println("------------------------------------------------------");
        System.out.println("Las coordenadas aleatorias del punto son: "+(int)(Math.random()* (100+1))+ "  , "+(int)(Math.random() * (100+1))); 
        }
        return 0;
    }
}
