package Modulo_02.Clase_07;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Plantel plantel = new Plantel();


        Scanner sc;

        {
            try {
                sc = new Scanner(new File("empleadosss.txt"));
                sc.useDelimiter("[\\n\\r;]+");
                while (sc.hasNextLine()) {
                    int tipo = sc.nextInt();
                    int legajo = sc.nextInt();
                    String nombre = sc.nextLine();
                    double sueldo = sc.nextDouble();
                    int diasTrabajados = sc.nextInt();
                    boolean presentismo = sc.hasNextBoolean();

                    switch (tipo){

                        case 1 :
                            plantel.agregarEmpleado(new Obr(legajo,nombre,sueldo,diasTrabajados));
                            break;

                        case 2 :
                            plantel.agregarEmpleado(new Vndr(legajo,nombre,sueldo,diasTrabajados));
                            break;

                        case 3 :
                            plantel.agregarEmpleado(new Admin(legajo,nombre,sueldo,presentismo));
                            break;

                    }


                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
}