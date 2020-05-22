/*
 Implemente un algoritmo que le permita solicitar el  ingreso por teclado,
el nombre de la universidad,el nombre del departamento,la carrera,
el nombre de a materia,nombres completos del estudiante,
nivel,numercedula,pais,ciudad,canton,provincia,ID,sexo.
 */
package datosdelestudiante;


/**
 *
 * @author: Lenin Paul Iñacaza Simba
 */
import java.util.Scanner;
public class DatosDelEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner objeto = new Scanner(System.in);//new.Reserva espacio de memoria
        System.out.println("Ingrese el nombre de la universidad:");
        String nombreUniversidad =objeto.nextLine();
        
        System.out.println("Ingrese el nombre del departamento:");
        String Departamento=objeto.nextLine();
        
        System.out.println("Ingrese el nombre de la carrera:");
        String Carrera=objeto.nextLine();
        
        System.out.println("Ingrese el nombre de la materia:");
        String Materia=objeto.nextLine();
        
        System.out.println("Ingrese el nombres completos del estudiante:");
        String Estudiante=objeto.nextLine();
        
        System.out.println("Ingrese el nombre el nivel en que se encuentra:");
        String Nivel=objeto.nextLine();
        
        System.out.println("Ingrese el nombre numero de cedula:");
        String numcedula=objeto.nextLine();
        
        System.out.println("Ingrese el Pais de origen:");
        String Origen=objeto.nextLine();
        
        System.out.println("Ingrese la ciudad:");
        String ciudad=objeto.nextLine();
        
        System.out.println("Ingrese el nombre del canton:");
        String canton=objeto.nextLine();
        
        System.out.println("Ingrese el nombre de la provincia:");
        String provincia=objeto.nextLine();
        
        System.out.println("Ingrese el ID:");
        String id=objeto.nextLine();
        
        System.out.println("Ingrese el tipo de sexo:");
        String sex=objeto.nextLine();
        
        System.out.println(" Bienvenido a las Universidad "+nombreUniversidad);
        

        
    }
    
}
