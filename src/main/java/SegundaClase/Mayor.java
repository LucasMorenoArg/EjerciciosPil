package SegundaClase;

import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        int mayor=-999;
        int cantPositivos = 0;
        int suma=0;
        double promedio=0;
        int cantDeNums=0;

       do {
           System.out.println("Ingrese un número entero o el ingrese número -1000 para salir");
           num=sc.nextInt();

           if (num !=(-1000) && num>mayor) {
               mayor = num;
           }
            if (num > 0){
                cantPositivos++;
            }
            if (num !=(-1000)){
                cantDeNums++;
                suma= suma + num;
                promedio = (double)suma/cantDeNums;
            }
       }
       while (num != -1000);
        System.out.println("El número mayor ingresado es " + mayor);
        System.out.println("Cantidad de positivos " + cantPositivos);
        System.out.println("El promedio es " + promedio);

    }
}
