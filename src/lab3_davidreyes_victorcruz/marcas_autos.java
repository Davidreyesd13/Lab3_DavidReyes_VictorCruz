package lab3_davidreyes_victorcruz;

public class marcas_autos extends Marcas {
String nombre;
String lema;
String fundacion;
int integracion;
String fundador;
double total;
String ceo;
int modelos;

    public marcas_autos(String nombre, String lema, String fundacion, int integracion, String fundador, double total, String ceo, int modelos) {
        this.nombre = nombre;
        this.lema = lema;
        this.fundacion = fundacion;
        this.integracion = integracion;
        this.fundador = fundador;
        this.total = total;
        this.ceo = ceo;
        this.modelos = modelos;
    }

    public marcas_autos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public int getIntegracion() {
        return integracion;
    }

    public void setIntegracion(int integracion) {
        this.integracion = integracion;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getModelos() {
        return modelos;
    }

    public void setModelos(int modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString() {
        return "marcas_autos " + "nombre=" + nombre + ", lema=" + lema + ", fundacion=" + fundacion + ", integracion=" + integracion + ", fundador=" + fundador + ", total=" + total + ", ceo=" + ceo + ", modelos=" + modelos;
    }


}
