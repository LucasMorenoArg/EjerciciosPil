package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int numUno;
        int numDos;
        try{
            Scanner sc = new Scanner(new File("reader.txt"));
            numUno = sc.nextInt();
            numDos = sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int suma= numUno+numDos;
        int resta=numUno-numDos;
        int multiplicacion= numUno*numDos;
        double divicion= (double)numUno/numDos;

        System.out.println("Resultado suma "+ suma);
        System.out.println("Resultado resta " + resta);
        System.out.println("Resultado multipliacion " + multiplicacion);
        System.out.println("Resultado divicion "+ divicion);



    }
}

