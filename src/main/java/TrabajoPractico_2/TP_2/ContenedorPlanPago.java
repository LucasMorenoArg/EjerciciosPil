package TrabajoPractico_2.TP_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void agregarPlandePago(String nombreContrib, int cantCuotas, double importeCuota) {
        List<Cuota> cuotas = new ArrayList<>();
        for (int i = 0; i < cantCuotas; i++) {
            Cuota cuota = new Cuota();
            cuota.setImporte(importeCuota);
            cuota.setEstado("pendiente");
            cuotas.add(cuota);
        }

        PlanPago planPago = new PlanPago();
        planPago.setNombreContribuyente(nombreContrib);
        planPago.setCuotas(cuotas);
        planPago.setTotalAdeudado(importeCuota * cantCuotas);
        planes.add(planPago);
    }

    public void registraPago(String nombre, int demoraDias) {
        for (PlanPago plan : planes) {
            if (plan.getNombreContribuyente().equals(nombre)) {
                plan.pagoCuota(demoraDias);

            }
        }
    }
    public long pagosTotal() {
           long total = planes.stream().filter(l -> l.getCuotas()
                .stream()
                .allMatch(cuota -> cuota.getEstado()
                .equals("abonada"))).count();
           return total;
        }

    public double sumaDeuda(){
         double total = planes.stream().map(p -> p.getTotalAdeudado())
                        .reduce(0d, (a, b) -> a + b);

         return total;
    }

    public List<Cuota> listadoCuotaPaga(String nombre){

       List<PlanPago> cuotas = planes.stream().filter(p -> p.getNombreContribuyente().equals(nombre))
               .collect(Collectors.toList());
         PlanPago planPago = cuotas.get(0);
         List<Cuota> cuotasPagas =  planPago.getCuotas().stream().filter(c -> c.getEstado().equals("abonada"))
               .collect(Collectors.toList());
         return cuotasPagas;

    }
}



