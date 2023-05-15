package Modulo_01.Clase_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainCodigo {


    public static void main(String[] args) {
        Scanner sc;
        Scanner sct;
        String localidadTeclado;

        try {
            sc = new Scanner(new File("cp.txt"));
            sct =new Scanner(System.in);
            System.out.println(" --Ingrese la localidad-- ");
            localidadTeclado = sct.nextLine().toUpperCase();

            sc.useDelimiter("[\\n\\r;]+");

            while (sc.hasNextLine()) {
                String provincia = sc.next();
                String codigo = sc.next();
                String localidad = sc.next();
                CodigoPostal cp = new CodigoPostal(provincia,codigo,localidad);


                if(cp.getLocalidad().contains(localidadTeclado)){
                    System.out.println(cp.getLocalidad() + " " + provincia);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
