package Modulo_01.Clase_02;

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int contadorPar=0;
        int contadorImpar=0;
        int num;


    do {
    System.out.println("Ingrese un numero entero o ingrese cero para salir");
     num = sc.nextInt();
     if (((num % 2) == 0) && (num != 0)){
         contadorPar++;

     }
     if (((num % 2) != 0)){
         contadorImpar++;

     }

    }
        while (num!=0);
        System.out.println("Cantidad de números pares "+ contadorPar );
        System.out.println("Cantidad de números impares "+ contadorImpar );

    }
    }

