package org.example;

import java.util.Scanner;

public class MayorDeTres {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero entero");
        int numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero entero");
        int numero2 = sc.nextInt();
        System.out.println("ingrese el tercer numero entero");
        int numero3 = sc.nextInt();

        if (numero1>=numero2 || numero1>=numero3 ){
            System.out.println("Numero mayor " + numero1);
        } else if (numero2>=numero1 || numero2>=numero3) {
            System.out.println("Numero mayor " + numero2);
        } else if (numero3>=numero1 || numero3>numero2) {
            System.out.println("Numero maoye " + numero3);
        }


    }
}
