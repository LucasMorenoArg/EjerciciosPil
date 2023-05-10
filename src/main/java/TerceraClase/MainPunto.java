package TerceraClase;

import java.util.Scanner;

public class MainPunto {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Punto p = new Punto(x, y);
        System.out.println("El punto es " + p.toString());
        System.out.println("Su distancia al origen es " + p.distanciaAlOrigen());
        System.out.println("Su coordenada X es " + p.getX() + " y su coordenada Y es " + p.getY());
        System.out.println("Esta ubicado en el cuadrante " + p.calcularCuadrante());


    }
}

