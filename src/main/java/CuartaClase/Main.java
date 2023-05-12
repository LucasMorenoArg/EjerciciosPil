package CuartaClase;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            PersonaService pers= new PersonaService();
            System.out.println("Promedio de edad " + pers.calcularPromedioEdades() + " años");
            System.out.println("Cantidad  de personas mayores al promedio " + pers.edadMayorPromedio());
            System.out.println("Datos de la persona mayor " + pers.personaMayor());
            System.out.println("Datos de la persona mayor " + pers.personaMenor());

            pers.busquedaPorTeclado();


        }
  }


