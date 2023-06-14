package TrabajoPractico_2;

public class Cuota {

    private double importe;
    private String estado;
    public Cuota() {
    }

    public Cuota(double importe, String estado) {

        this.importe = importe;
        this.estado = estado;
    }
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cuota{" +
                " importe=" + importe +
                ", estado='" + estado + '\'' +
                '}';
    }
}
