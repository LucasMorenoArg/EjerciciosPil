package PrimerClase;

import java.util.Scanner;

public class MayorDeDos {





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero entero");
        int nroUno = sc.nextInt();
        System.out.print("ingrese un segundo numero entero");
        int nroDos = sc.nextInt();


        while (nroUno > nroDos) {
            System.out.println("Numero uno es mayor ");
            break;
        }
        while (nroDos > nroUno) {
            System.out.println("Numero dos es mayor");
            break;
        }
        while (nroUno == nroDos) {
            System.out.println("Los dos numero son iguales");
            break;
        }

    }

}
