package SegundaClase;

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int acum;
        int contadorPar=0;
        int contadorImpar=0;
        int suma;
        int num;

    do {
    System.out.println("Ingrese un numero entero");
     num = sc.nextInt();
     if (num%2==0){
         contadorPar++;
     }
     if (num%2!=0){
         contadorImpar++;
     }
        System.out.println("Cantidad de numeros pares "+ contadorPar );
        System.out.println("Cantidad de numeros impares "+ contadorImpar );
    }
        while (num!=0);

    }
    }

