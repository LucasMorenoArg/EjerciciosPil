package TrabajoPractico;

import java.util.ArrayList;
public class Libro {

    private int codigo;
    private String Titulo;
    private int precioReposicion;
    private ArrayList<Prestamo> prestamoArrayList=new ArrayList<>();

    private String estado;

    public Libro() {
    }

    public Libro(int codigo, String titulo, int precioReposicion, String estado) {
        this.codigo = codigo;
        Titulo = titulo;
        this.precioReposicion = precioReposicion;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void agregarPrestamo(Prestamo e){
        prestamoArrayList.add(e);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getPrecioReposicion() {
        return precioReposicion;
    }

    public void setPrecioReposicion(int precioReposicion) {
        this.precioReposicion = precioReposicion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", Titulo='" + Titulo + '\'' +
                ", precioReposicion=" + precioReposicion +
                '}';
    }

    public void listaPrestamos(){
        for (Prestamo p:prestamoArrayList) {
            System.out.println(p);
        }
    }

    public ArrayList<Prestamo> getPrestamoArrayList() {
        return prestamoArrayList;
    }
}

