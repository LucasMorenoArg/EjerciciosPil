package Modulo_01.Clase_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClase4 {


        public static void main(String[] args) {

            Plantel pl1= new Plantel();
            Scanner scTeclado = new Scanner(System.in);
            try {
                Scanner sctxt= new Scanner(new File("personas.txt"));

                sctxt.useDelimiter("[\\n\\r;]+");

                while (sctxt.hasNextLine()){

                    String dni = sctxt.next();
                    long longDni = Long.parseLong(dni);
                    String nombre = sctxt.next().toUpperCase();
                    String apellido = sctxt.next().toUpperCase();
                    String edad = sctxt.next();
                    int edadInt = Integer.parseInt(edad);

                    Persona pers = new Persona(longDni,nombre,apellido,edadInt);

                    pl1.agregarPersona(pers);



                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


        }
  }


