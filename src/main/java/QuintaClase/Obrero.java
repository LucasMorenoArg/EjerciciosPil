package QuintaClase;

public class Obrero extends Empleado {


    public Obrero() {
    }

    public double getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(int valorDia) {
        this.valorDia = valorDia;
    }

    public Obrero(double sueldo) {
        super(sueldo);
    }


    @Override
    public double calcularSueldo() {
         double sueldoTotal= getDiasTrabajados()*getValorDia();
        return sueldoTotal;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo();
    }

    @Override
    public void setSueldo(double sueldo) {
        super.setSueldo(sueldo);
    }



    @Override
    public String toString() {
        return "Obrero{" +
                "sueldo=" + sueldo +
                '}';
    }
}
