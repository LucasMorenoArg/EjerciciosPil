package Modulo_01.Clase_06.ConjuntoEmpleados;

import Modulo_01.Clase_06.ListaEmpleados.Empleado;

public class ConjVendedor extends Empleado {

        private double totalVentas;

        public ConjVendedor(int legajo, String nombre, double sueldoBasico, double totalVentas) {
            super(legajo, nombre, sueldoBasico);
            this.totalVentas = totalVentas;
        }

        public double getTotalVentas() {
            return totalVentas;
        }

        public void setTotalVentas(double totalVentas) {
            this.totalVentas = totalVentas;
        }

        @Override
        public double calcularSueldo() {
            return getSueldoBasico() + 0.01 * totalVentas;
        }
    }

