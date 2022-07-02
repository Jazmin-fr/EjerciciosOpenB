/*Crea una clase Persona con las siguientes variables:
*La edad
*El nombre
*El teléfono
*Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase
tendrá la variable credito solo para esa clase.
*Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.*/
package Tema9;

public class Tema_9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 20;
        cliente.nombre = "Teresa";
        cliente.telefono = "0985656988";
        cliente.credito = 20000;
        System.out.println("Edad: "+cliente.edad+", Nombre: "+cliente.nombre+", su telefono: "+cliente.telefono
                +" y su credito es: "+cliente.credito);

    }
}

class Persona {

    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {

    int credito;

}

final class Trabajador extends Persona{
    float salario;
}
