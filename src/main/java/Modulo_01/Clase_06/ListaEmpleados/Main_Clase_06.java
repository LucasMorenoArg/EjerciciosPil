package Modulo_01.Clase_06.ListaEmpleados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Clase_06 {


    public static void main(String[] args) {
        ListaEmpleados plantel =new ListaEmpleados();

        Scanner sc;
        {
           try {
                sc = new Scanner(new File("empleadosss.txt"));
                sc.useDelimiter("[\\n\\r;]+");


                while (sc.hasNextLine()) {
                    int tipo = sc.nextInt();

                    int legajo = sc.nextInt();

                    String nombre = sc.next();

                    double sueldo = sc.nextDouble();

                    switch (tipo){
                        case 1 :
                            int diasTrabajados = sc.nextInt();
                            plantel.agregarEmpleado(new Obrero(legajo,nombre,sueldo,diasTrabajados));
                            break;

                        case 2:
                            boolean presentismo = sc.nextBoolean();
                            plantel.agregarEmpleado(new Administrativo(legajo,nombre,sueldo,presentismo));
                            break;

                        case 3:
                            double totalVentas = sc.nextDouble();
                            plantel.agregarEmpleado(new Vendedor(legajo,nombre,sueldo,totalVentas));
                    }
             }

               System.out.println(plantel.cantEmplTipo());//Cantidad total de empleados por tipo.
               System.out.println("Total sueldos= "+plantel.sueldoTotal());//Total de sueldos general.
               System.out.println("Total presentismo " + plantel.presentAdministradores());
               System.out.println("Sueldo mas Bajo " + plantel.sueldoMenor());
               System.out.println("Sueldo Promedio Obreros " + plantel.promedioObreros());

               //listadoEmpleados.forEach(emp -> System.out.println(emp));






            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
