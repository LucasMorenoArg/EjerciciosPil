package Modulo_01.Clase_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_Clase_04 {


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
                    System.out.println();
                    Persona pers = new Persona(longDni,nombre,apellido,edadInt);
                    pl1.agregarPersona(pers);
                    System.out.println(pers);
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }



            //System.out.println("Persona mayor " + pl1.personaMayor());
            //System.out.println("Persona menor " +pl1.personaMenor());
            System.out.println("Persona mayor " + pl1.personaMayor());
            System.out.println("Lista Ordenada por nombre y apellido " + pl1.ordenarListaPersonas());

        }
  }


