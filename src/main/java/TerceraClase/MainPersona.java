package TerceraClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {

        Persona persMayor= new Persona();
        Persona persMenor=new Persona(100);

        try ( Scanner sc = new Scanner(new File("personas2.txt"))) {

           sc.useDelimiter("[\\n\\r;]+");
            while (sc.hasNextLine()){

               String dni = sc.next();
               Long longDni =Long.parseLong(dni);
               String nombre = sc.next();
               String apellido = sc.next();
               String edad = sc.next();
               int intEdad = Integer.parseInt(edad);
               Persona persona = new Persona(longDni,nombre,apellido,intEdad);


                if(persona.getEdad() > persMayor.getEdad()){
                    persMayor = persona;

                }

                if (persMenor.getEdad() > persona.getEdad()){
                    persMenor = persona;

                }


            }
            System.out.println("Persona mayor " + persMayor);
            System.out.println("Persona menor " + persMenor);


        }  catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
