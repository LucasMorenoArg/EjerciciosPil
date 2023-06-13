package TrabajoPractico_2.TP_2;

import java.util.List;

public class PlanPago {
    private String nombreContribuyente;
    private double totalAdeudado;
    private List<Cuota> cuotas;
    private double interesesCobrados;
    public PlanPago() {
    }
    public PlanPago(String nombreContribuyente, double totalAdeudado, List<Cuota> cuotas) {
        this.nombreContribuyente = nombreContribuyente;
        this.totalAdeudado = totalAdeudado;
        this.cuotas = cuotas;
    }
    public String getNombreContribuyente() {
        return nombreContribuyente;
    }
    public void setNombreContribuyente(String nombreContribuyente) {
        this.nombreContribuyente = nombreContribuyente;
    }
    public double getTotalAdeudado() {
        return totalAdeudado;
    }
    public void setTotalAdeudado(double totalAdeudado) {
        this.totalAdeudado = totalAdeudado;
    }
    public List<Cuota> getCuotas() {
        return cuotas;
    }
    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    @Override
    public String toString() {
        return "PlanPago{" +
                "nombreContribuyente='" + nombreContribuyente + '\'' +
                ", totalAdeudado=" + totalAdeudado +
                ", cuotas=" + cuotas +
                '}';
    }

    public void pagoCuota(int demora){
        if (demora == 0) {
            for (Cuota cuota: cuotas) {
                if (cuota.getEstado().equals("pendiente")){
                    cuota.setEstado("abonada");
                    return;
                }
            }
        } else {
            for (Cuota cuota : cuotas){
                if (cuota.getEstado().equals("pendiente")){
                    cuota.setEstado("abonada");
                     double intDiario = cuota.getImporte()*0.5;
                     double interesCuota = intDiario*demora;
                     cargarInteres(interesCuota);
                     return;
                }
            }
        }
    }

    public void cargarInteres(double interes){
        interesesCobrados+=interes;
    }


}
