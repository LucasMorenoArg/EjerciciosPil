package TrabajoPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainTp {

    public static void main(String[] args) {

        Biblioteca biblioteca=new Biblioteca();

        try {
            Scanner sc = new Scanner(new File("Libros.txt"));
            sc.useDelimiter("[\\n\\r;]+");

            while (sc.hasNextLine()){
                int codigo = sc.nextInt();
                String titulo = sc.next();
                int precioRepo = sc.nextInt();
                String estado = sc.next();
                biblioteca.agregarLibro(new Libro(codigo,titulo,precioRepo, estado));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }

        try (Scanner scp = new Scanner(new File("Prestamos.txt"))) {
            scp.useDelimiter("[\\n\\r;]+");

            while (scp.hasNextLine()){
                String nombre = scp.next();
                int cantDeDias = scp.nextInt();
                boolean devuelto = scp.nextBoolean();
                int codigoLibro = scp.nextInt();
                biblioteca.registrarPrestamos(codigoLibro,new Prestamo(nombre,cantDeDias,devuelto));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println(biblioteca.sumarPrecioExtraviados());
        biblioteca.buscarSolicitantexTitulo("el aleph");
        System.out.println(biblioteca.mostrarEstadoxLibro());
        System.out.println(biblioteca.promedio());




    }
}
