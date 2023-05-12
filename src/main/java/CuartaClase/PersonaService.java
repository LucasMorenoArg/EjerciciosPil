package CuartaClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {

    ArrayList<Persona> pers = new ArrayList<>();

    public PersonaService() {
        llenarLista();
    }

    public void llenarLista() {

        Scanner sc;

        try {
            sc = new Scanner(new File("personas2.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        sc.useDelimiter("[\\n\\r;]+");
        while (sc.hasNextLine()) {
            String dni = sc.next();
            Long longDni = Long.parseLong(dni);
            String nombre = sc.next();
            String apellido = sc.next();
            String edad = sc.next();
            int intEdad = Integer.parseInt(edad);
            Persona persona = new Persona(longDni, nombre, apellido, intEdad);
            pers.add(persona);
        }
    }

    public double calcularPromedioEdades() {
        int edades = 0;
        double promedioEdades = 0;
        for (int i = 0; i < this.pers.size(); i++) {
            //edades += pers.get(i).getEdad();
            Persona personaAux = pers.get(i);
            edades += personaAux.getEdad();

        }
        promedioEdades = (double) edades / pers.size();

        return promedioEdades;
    }

    public int edadMayorPromedio() {
        int acum = 0;
        for (int i = 0; i < this.pers.size(); i++) {

            if (pers.get(i).getEdad() > calcularPromedioEdades()) {
                acum++;
            }
        }
        return acum;
    }

    public Persona personaMayor() {
        Persona personaAux = pers.get(0);
        for (int i = 0; i < this.pers.size(); i++) {

            if (pers.get(i).getEdad() > personaAux.getEdad()) {
                personaAux = pers.get(i);

            }
        }
        return personaAux;
    }

    public Persona personaMenor() {
        Persona personaAux = pers.get(0);
        for (int i = 0; i < this.pers.size(); i++) {

            if (pers.get(i).getEdad() < personaAux.getEdad()) {
                personaAux = pers.get(i);

            }

        }   return personaAux;
    }

    public void busquedaPorTeclado(){

        System.out.println("Ingrese un apellido por teclado ");
        Scanner scApellido = new Scanner(System.in);
        String apellido = scApellido.next().toUpperCase();
        ArrayList<Persona> personaArrayList= new ArrayList<>();
        Persona persona = new Persona();


        for (int i =0; i<this.pers.size(); i++) {

            if (pers.get(i).getApellido().contains(apellido)) {

                persona = pers.get(i);
                personaArrayList.add(persona);
            }



        }
        System.out.println(personaArrayList);
        System.out.println(personaArrayList.size());



    }
}


