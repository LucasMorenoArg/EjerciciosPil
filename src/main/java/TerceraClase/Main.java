package TerceraClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try ( Scanner sc = new Scanner(new File("personas.txt"))) {

           sc.useDelimiter("[\\n\\r;]+");
            while (sc.hasNextLine()){

               String dni = sc.next();
               Long longDni =Long.parseLong(dni);
               String nombre = sc.next();
               String apellido = sc.next();
               String edad = sc.next();
               int intEdad = Integer.parseInt(edad);
               Persona persona=new Persona(longDni,nombre,apellido,intEdad);
               System.out.println(persona);

                if(persona.getEdad()>18){
                    System.out.println(persona);
                }



            }

        }  catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
