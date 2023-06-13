package TrabajoPractico_2.TP_2;

public class Cuota {
    private int numCuota;
    private double importe;
    private String estado;

    public Cuota() {
    }

    public Cuota(int numCuota, double importe, String estado) {
        this.numCuota = numCuota;
        this.importe = importe;
        this.estado = estado;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
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
                "numCuota=" + numCuota +
                ", importe=" + importe +
                ", estado='" + estado + '\'' +
                '}';
    }
}
