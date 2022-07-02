
package Tema8;
//Para practicar la encapsulación:
//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
public class Tema8 {
    public static void main(String[] args){
      Persona persona = new Persona();
      persona.setEdad(20);
      persona.setNombre("Angel");
      persona.setTelefono("0985456321");
        System.out.println("Su edad es: "+persona.getEdad()+", "+"su nombre es: "+persona.getNombre()+
                " "+"y su numero de telefono es: "+persona.getTelefono());
    }

}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    
    
    
}
