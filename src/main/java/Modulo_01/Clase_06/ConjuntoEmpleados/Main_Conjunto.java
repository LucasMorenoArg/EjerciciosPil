package Modulo_01.Clase_06.ConjuntoEmpleados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_Conjunto {

    public static void main(String[] args) {
        ConjuntoEmpleados plantel = new ConjuntoEmpleados();

        try (Scanner sc = new Scanner(new File("empleados.csv"))) {
            sc.useDelimiter("[\\n\\r;]+");
            while (sc.hasNextLine()){
                while (sc.hasNextLine()) {
                    int tipo = sc.nextInt();

                    int legajo = sc.nextInt();

                    String nombre = sc.next();

                    double sueldo = sc.nextDouble();

                    switch (tipo){
                        case 1 :
                            int diasTrabajados = sc.nextInt();
                            plantel.agregarEmpleado(new ConjObrero(tipo,legajo,nombre,sueldo,diasTrabajados));
                            break;

                        case 2:
                            boolean presentismo = sc.nextBoolean();
                            plantel.agregarEmpleado(new ConjAdministrativo(tipo,legajo,nombre,sueldo,presentismo));
                            break;

                        case 3:
                            double totalVentas = sc.nextDouble();
                            plantel.agregarEmpleado(new ConjVendedor(legajo,nombre,sueldo,totalVentas));

                    }
                }






            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encotrado");
        }

        System.out.println(plantel.cantEmplTipo());
        System.out.println(plantel.sueldoTotal());
        System.out.println("----------------");
        plantel.sueldoMenor();
    }


}
