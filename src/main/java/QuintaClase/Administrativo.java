package QuintaClase;

public class Administrativo extends Empleado{

    boolean presentismo= false;

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
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

    public Administrativo() {
    }

    public Administrativo(double sueldo) {
        super(sueldo);
    }

    @Override
    public double calcularSueldo() {

        double sueldo;
        if (isPresentismo()==false){

          sueldo=getDiasTrabajados()*getValorDia();}
        else { sueldo=getDiasTrabajados()*getValorDia()*1.15;}

        return sueldo;
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
        return "Administrativo{}";
    }
}
