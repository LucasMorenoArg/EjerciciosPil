package Modulo_02.Clase_08;

import java.util.ArrayList;
import java.util.Random;

public class Main_Quini {
    public static void main(String[] args) {
        Sorteo sorteo = new Sorteo();

        ArrayList<Boleta> boletas = new ArrayList<>();
        Random random = new Random();

        //Generador de boletas.
        for (int i=0; i<10000; i++){
            Boleta carton = new Boleta();
            for (int j = 0; j<3; j++){
                int x=0;
                boolean estaPresente = false;
                x=random.nextInt(1,47);
                estaPresente = carton.getNumeros().contains(x);
                if (estaPresente){
                 x=random.nextInt(1,47);}
                carton.agregarNumero(x);
            }
            boletas.add(carton);
        }


        //Sorteo.
        for (int i = 0; i<3; i++){
            int x=0;
            x=random.nextInt(1,47);
            sorteo.agregarNumero(x);
        }

        //Comparador de boletas.
        for (Boleta b:boletas) {
            boolean esIgual = false;
            esIgual = b.getNumeros().equals(sorteo.getResultado());
            if (esIgual == true){
                System.out.println("Carton ganador: " + b.getNumeros() + " " + sorteo.getResultado());
            }
        }

    }

}
