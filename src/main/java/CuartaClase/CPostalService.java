package CuartaClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CPostalService {

        ArrayList<CodigoPostal> k = new ArrayList<>();
        ArrayList<CodigoPostal> x = new ArrayList<>();
        ArrayList<CodigoPostal> h = new ArrayList<>();

    Scanner sc;

    {
        try {
            sc = new Scanner(new File("cp.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
