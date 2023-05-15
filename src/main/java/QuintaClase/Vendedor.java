package QuintaClase;

public class Vendedor extends Empleado {

    double diasTrabajados;
    double valorDia;

    double ventas=0;



    public Vendedor(double sueldo) {
        super(sueldo);
    }

    public double getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(double diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    @Override
    public double calcularSueldo() {

        return 0;
    }
    @Override
    public double getSueldo() {

        sueldo = 0;
        if (getVentas() > 0) {
            sueldo = getDiasTrabajados() * getValorDia() * (getVentas() * 1.01);
        } else {
            sueldo = getDiasTrabajados() * getValorDia();
        } return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        super.setSueldo(sueldo);
    }

    @Override
    public String toString() {
        return "Vendedor{}";
    }
}
