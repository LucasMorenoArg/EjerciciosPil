package TrabajoPractico;

import java.util.ArrayList;

public class Prestamo {

    private String nombreDeSolicitante;
    private int cantidadDeDias;
    private boolean devuelto;
   /* private int codigoLibro;


    public Prestamo(String nombreDeSolicitante, int cantidadDeDias, boolean devuelto, int codigoLibro) {
        this.nombreDeSolicitante = nombreDeSolicitante;
        this.cantidadDeDias = cantidadDeDias;
        this.devuelto = devuelto;
        this.codigoLibro = codigoLibro;
    }*/

    public Prestamo(String nombreDeSolicitante, int cantidadDeDias, boolean devuelto ) {
        this.nombreDeSolicitante = nombreDeSolicitante;
        this.cantidadDeDias = cantidadDeDias;
        this.devuelto = devuelto;


    }

    public String getNombreDeSolicitante() {
        return nombreDeSolicitante;
    }

    public void setNombreDeSolicitante(String nombreDeSolicitante) {
        this.nombreDeSolicitante = nombreDeSolicitante;
    }

    public int getCantidadDeDias() {
        return cantidadDeDias;
    }

    public void setCantidadDeDias(int cantidadDeDias) {
        this.cantidadDeDias = cantidadDeDias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "nombreDeSolicitante='" + nombreDeSolicitante + '\'' +
                ", cantidadDeDias=" + cantidadDeDias +
                ", devuelto=" + devuelto +
                '}';
    }




}
