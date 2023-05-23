package A_Pruebas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class MainEjer {

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> randomNumbers = new ArrayList<>();


        /*int min = -100000;
        int max = 100000;

        // Generar 10 números aleatorios y agregarlos al ArrayList
        for (int i = 0; i < 1000000000; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            randomNumbers.add(randomNumber);
        }

        // Imprimir los números aleatorios almacenados en el ArrayList
        for (int number : randomNumbers) {
            System.out.println(number);
        }
*/

        System.out.println("Con un hashSet");
        HashSet<Integer> conjunto = new HashSet<>();

        long inicio= System.currentTimeMillis();
        //for (int i=0; i<100000;i++){

        //conjunto.add(x);
        //}

        long fin = System.currentTimeMillis();
        long duracion = fin-inicio;
        System.out.println("Para ingresar demoró " + duracion);
        System.out.println(conjunto.size());
        int encontrados =0;
        for (int i=0; i<100000;i++){
            int buscado=r.nextInt(-100000,100000);
            boolean existe = conjunto.contains(buscado);
        }


        int x;
        for(int i=0; i<5; i++ ){
           x=r.nextInt(0,2);
            System.out.println(x);
        }



    }
}
