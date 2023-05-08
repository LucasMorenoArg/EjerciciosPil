package SegundaClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Numeros {

    //Suma de todos;
    //Promedio de todos;
    //Menor de todos;
    //Cantidad de pares;
    //Cantidad de numeros por cada digitos en que termine;

    public static void main(String[] args) {
        int num=0;
        int acum=0;
        int acumScanner=0;
        int acumMenor=0;
        int contadorDePares=0;
        int cero=0;
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int seis=0;
        int siete=0;
        int ocho=0;
        int nueve=0;
        int numMenor;
        Scanner scannerUno;
        try {
            scannerUno = new Scanner(new File("numeros.txt"));
            numMenor=num;
            while(scannerUno.hasNext()){
                if(scannerUno.hasNext()){
                    acumScanner++;
                }
                num = scannerUno.nextInt();
                acum+=num;
                if (num<numMenor){numMenor=num;}
                if(num %2==0){contadorDePares++;}
                if(num%10==0){cero++;}
                if(num%10==1){uno++;}
                if(num%10==2){dos++;}
                if(num%10==3){tres++;}
                if(num%10==4){cuatro++;}
                if (num%10==5){cinco++;}
                if (num%10==6){seis++;}
                if (num%10==7){siete++;}
                if (num%10==8){ocho++;}
                if (num%10==9){nueve++;}
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        double promedio=(double) acum/acumScanner;
        int total= cero+uno+dos+tres+cuatro+cinco+seis+siete+ocho+nueve;
        System.out.println("Suma de total de todos los numeros es igual a " + acum);
        System.out.println("Promedio total de todos los numero es igual a " + promedio);
        System.out.println("El numero menor es " + acumMenor);
        System.out.println("Cantidad de numeros pares es igual a = " + contadorDePares);
        System.out.println("Numeros finalizados en cero " + cero);
        System.out.println("Numeros finalizados en uno " + uno);
        System.out.println("Numeros finalizados en dos " + dos);
        System.out.println("Numeros finalizados en tres " + tres);
        System.out.println("Numeros finalizados en cuatro " + cuatro);
        System.out.println("Numeros finalizados en cinco " + cinco);
        System.out.println("Numeros finalizados en seis  " + seis);
        System.out.println("Numeros finalizados en siete " + siete);
        System.out.println("Numeros finalizados en ocho " + ocho );
        System.out.println("Numeros finalizados en nueve " + nueve);
        System.out.println("El numero menor es " + numMenor);


    }
}
