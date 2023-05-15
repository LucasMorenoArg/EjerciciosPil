package Modulo_01.Clase_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CPostalService {

        ArrayList<CodigoPostal> codigoPostalArrayList = new ArrayList<>();
        ArrayList<CodigoPostal> k = new ArrayList<>();
        ArrayList<CodigoPostal> x = new ArrayList<>();
        ArrayList<CodigoPostal> h = new ArrayList<>();

        public CPostalService(){
            llenarLista();
        }

    public void llenarLista() {


        Scanner sc = null;

        try {
            sc = new Scanner(new File("cp.txt"));

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }

        sc.useDelimiter("[\\n\\r;]+");

        while (sc.hasNextLine()) {
            String provincia = sc.next();
            String codigo = sc.next();
            String localidad = sc.next();
            CodigoPostal cp = new CodigoPostal(provincia, codigo, localidad);
            codigoPostalArrayList.add(cp);
        }

        for (int i = 0; i < codigoPostalArrayList.size(); i++) {
            if (codigoPostalArrayList.get(i).getProv().contains("K")) {
                k.add(codigoPostalArrayList.get(i));
                if (codigoPostalArrayList.get(i).getProv().contains("X")) {
                    x.add(codigoPostalArrayList.get(i));
                }
                if (codigoPostalArrayList.get(i).getProv().contains("H")) {
                    h.add(codigoPostalArrayList.get(i));
            }
       }

            System.out.println(" " + k.size());
            System.out.println(" " + x.size());
            System.out.println(" " + h.size());
            System.out.println("Total " + (k.size() + x.size()));

        }


    }
}

