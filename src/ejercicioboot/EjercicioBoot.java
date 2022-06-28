/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioboot;

/**
 *
 * @author Jazmin Fernandez
 */
public class EjercicioBoot {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //llamar a la funcion y dar valores(primera parte)
        suma(5, 10, 20);
        //crear un objeto miCoche y añadir una puerta(segunda parte)
        Coche miCoche = new Coche();
        miCoche.Incrementar();
       
        
        //mostrar el numero de puertas que tiene el objeto
        System.out.println(miCoche.numPuertas);
        
    }
    //primera parte: Funcion con tres parametros
    public static void suma(int a, int b, int c){
        int resultado = (a+b+c);
        System.out.println(resultado);
    }
    
    //Segunda parte: clase coche
public static class Coche{
    //variable numerica que almacene el numero de puertas
    int numPuertas = 0;
    
    //funcion para incrementar el numero de puertas que tiene el coche
   public void Incrementar(){
       this.numPuertas++;
   }
}
}
