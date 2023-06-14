package TrabajoPractico;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libroArrayList = new ArrayList<>();

    public void agregarLibro(Libro e) {
        libroArrayList.add(e);
    }

    public void registrarPrestamos(int codigoLibro, Prestamo prestamo) {
        for (Libro l : libroArrayList) {
            if (l.getCodigo() == codigoLibro && l.getEstado().equalsIgnoreCase("disponible")) {
                l.agregarPrestamo(prestamo);
                if (!prestamo.isDevuelto()) {
                    l.setEstado("Prestado");
                }
            }
        }
    }

    public String mostrarEstadoxLibro() {
        int disponible = 0;
        int prestado = 0;
        int extraviado = 0;

        for (Libro p : libroArrayList) {
            if (p.getEstado().equalsIgnoreCase("disponible")) {
                disponible++;
            }
            if (p.getEstado().equalsIgnoreCase("prestado")) {
                prestado++;
            }
            if (p.getEstado().equalsIgnoreCase("extraviado")) {
                extraviado++;
            }
        }
        return  "Libros en estado disponible = " + disponible +
                " Libros en estado prestado = " + prestado +
                " Libros en estado extraviado = " + extraviado;
    }

    public String sumarPrecioExtraviados() {
        int total = 0;
        for (Libro l: libroArrayList) {
        if (l.getEstado().equalsIgnoreCase("extraviado")){
            total += l.getPrecioReposicion();
            }
        }
        return "Monto total de libros extraviados $" + total + ".";
    }

    public void buscarSolicitantexTitulo(String nombreLibro){
        for (Libro libro: libroArrayList) {
            if (libro.getTitulo().equalsIgnoreCase(nombreLibro)) {
                System.out.println(libro.getPrestamoArrayList());
            }
        }
    }

    public String promedio(){
        double sumaPrestamos= 0;
        for (Libro l: libroArrayList) {
            sumaPrestamos += l.getPrestamoArrayList().size();
        }
        return "Promedio de prestamo por libro "+ sumaPrestamos / libroArrayList.size();
    }
}





