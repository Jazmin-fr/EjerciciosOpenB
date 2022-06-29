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
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //llamar a la funcion y dar valores(primera parte)
        suma(5, 10, 20);
        //crear un objeto miCoche y añadir una puerta(segunda parte)
        Coche miCoche = new Coche();
        miCoche.Incrementar();
        miCoche.Incrementar();
       
        
        //mostrar el numero de puertas que tiene el objeto(segunda parte)
        System.out.println("Numero de puertas que tiene el Objeto: "+ miCoche.numPuertas);
        
    }
    //primera parte: Funcion con tres parametros
    public static void suma(int a, int b, int c){
        int resultado = (a+b+c);
        System.out.println(resultado);
    }
    
    //Segunda parte: clase coche
public static class Coche{
    //variable numerica que almacene el numero de puertas
    int numPuertas = 4;
    
    //funcion para incrementar el numero de puertas que tiene el coche
   public void Incrementar(){
       this.numPuertas++;
   }
}
}
