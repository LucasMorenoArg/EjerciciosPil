package TrabajoPractico_2.TP_2;

import java.util.ArrayList;
import java.util.List;

public class ContenedorPlanPago {

    private List<PlanPago> planes;

    public ContenedorPlanPago(List<PlanPago> planes) {
        this.planes = planes;
    }
    public List<PlanPago> getPlanes() {
        return planes;
    }
    public void setPlanes(List<PlanPago> planes) {
        this.planes = planes;
    }
    @Override
    public String toString() {
        return "contenedorPlanPago{" +
                "planes=" + planes +
                '}';
    }

    public void agregarPlandePago(String nombreContrib, int cantCuotas, double importeCuota){
        List<Cuota> cuotas = new ArrayList<>();
        for (int i = 0; i <cantCuotas ; i++) {
            Cuota cuota = new Cuota();
            cuota.setImporte(importeCuota);
            cuota.setEstado("pendiente");
            cuotas.add(cuota);
        }
        PlanPago planPago=new PlanPago();
        planPago.setNombreContribuyente(nombreContrib);
        planPago.setCuotas(cuotas);
        planPago.setTotalAdeudado(importeCuota*cantCuotas);
        planes.add(planPago);
    }

    public void registraPago(String nombre, int demoraDias){
        for (PlanPago plan: planes) {
            if (plan.getNombreContribuyente().equals(nombre)) {
                plan.pagoCuota(demoraDias);
            }
        }
    }

    public void pagosTotal(){
        for (PlanPago plan:planes) {
            System.out.println(plan.getCuotas());
        }
    }
}
