package Modulo_02.Clase_11;

import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.in;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.println("Ingresar letra A, B o C");
        String  letra = sc.next().toUpperCase();
        HashMap<String, Isaludo.ISaludo> mapSaludo = new HashMap<>();

        mapSaludo.put("A", () -> System.out.println("Buen día"));
        mapSaludo.put("B", () -> System.out.println("Buenas tardes"));
        mapSaludo.put("C", () -> System.out.println("Buenas noches"));
        mapSaludo.get(letra).Saludo();


    }
}
