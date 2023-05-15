package Modulo_01.Clase_04;

public class CodigoPostal {

    String prov;
    String codigo;
    String localidad;


    public CodigoPostal() {
    }

    public CodigoPostal(String localidad) {
        this.localidad = localidad;
    }

    public CodigoPostal(String prov, String codigo, String localidad) {
        this.prov = prov;
        this.codigo = codigo;
        this.localidad = localidad;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" +
                "prov='" + prov + '\'' +
                ", codigo='" + codigo + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }

}
