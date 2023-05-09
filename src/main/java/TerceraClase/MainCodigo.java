package TerceraClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainCodigo {


    public static void main(String[] args) {


        Scanner sc;
        Scanner sct;
        String localidadTeclado;

        try {
            sc = new Scanner(new File("CP.txt"));
            sct =new Scanner(System.in);
            System.out.println("Ingrese la localidad ");
            localidadTeclado = sct.nextLine().toUpperCase();
            System.out.println(localidadTeclado);
            String localidad =localidadTeclado;
            CodigoPostal cp = new CodigoPostal(localidad);
            sc.useDelimiter("[\\n\\r;]+");
            while (sc.hasNextLine()) {



            if(cp.getLocalidad() == localidad. ){
                System.out.println(cp.getLocalidad());
            }



            }
            //System.out.println(cp.getLocalidad());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
