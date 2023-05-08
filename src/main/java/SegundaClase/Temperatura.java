package SegundaClase;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cantidad de días bajo cero;
        //Promedio de temperaturas;
        //Promedio de temperatura de los dias cálidos (temp>20º);
        //Mostrar

        int dias;
        int diaCalido=0;
        int diasBajoCero=0;
        int temperaturas;
        int tempCalida=0;
        int promedioTemperaturas=0;
        int sumaTemperaturas=0;
        int sumaTemperaturasCalidas=0;
        int acumTemperaturas = 1;
        boolean bandera= false;


        System.out.println("Ingrese la cantidad de días");
        dias = sc.nextInt();

         while(dias>=acumTemperaturas){
             System.out.println("Ingrese las temperaturas de cada día");
             temperaturas = sc.nextInt();
             sumaTemperaturas+=temperaturas;
             acumTemperaturas++;
             if (temperaturas<=0){
              diasBajoCero++;
             }
             if(temperaturas>20){
                 sumaTemperaturasCalidas+=temperaturas;
                 diaCalido++;
                 tempCalida=sumaTemperaturasCalidas/diaCalido;
             }
             if (temperaturas>=40){
                 bandera=true;
             }
         }
        promedioTemperaturas= sumaTemperaturas/dias;
        System.out.println("Cantidad de dias con temperatura bajo cero " + diasBajoCero);
        System.out.println("Promedio de temperaturas " + promedioTemperaturas + " grados");
        System.out.println("Promedio de temperatura de los dias cálidos " + tempCalida+ " grados");
        System.out.println("Días con temperatura mayor a 40º "+bandera);





    }
}

