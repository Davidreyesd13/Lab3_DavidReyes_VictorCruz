
package lab3_davidreyes_victorcruz;


public class Modelos extends marcas_autos{
    String nombreMol;
    int año_fab;
    String tipo_mot;
    String cil_mot;
    double precio;
    boolean tecno;

    public Modelos() {
    }

    public Modelos(String nombreMol, int año_fab, String tipo_mot, String cil_mot, double precio, boolean tecno) {
        this.nombreMol = nombreMol;
        this.año_fab = año_fab;
        this.tipo_mot = tipo_mot;
        this.cil_mot = cil_mot;
        this.precio = precio;
        this.tecno = tecno;
    }



    public String getNombreMol() {
        return nombreMol;
    }

    public void setNombreMol(String nombreMol) {
        this.nombreMol = nombreMol;
    }

    public int getAño_fab() {
        return año_fab;
    }

    public void setAño_fab(int año_fab) {
        this.año_fab = año_fab;
    }

    public String getTipo_mot() {
        return tipo_mot;
    }

    public void setTipo_mot(String tipo_mot) {
        this.tipo_mot = tipo_mot;
    }

    public String getCil_mot() {
        return cil_mot;
    }

    public void setCil_mot(String cil_mot) {
        this.cil_mot = cil_mot;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isTecno() {
        return tecno;
    }

    public void setTecno(boolean tecno) {
        this.tecno = tecno;
    }

    @Override
    public String toString() {
        return "Modelos{" + "nombreMol=" + nombreMol + ", a\u00f1o_fab=" + año_fab + ", tipo_mot=" + tipo_mot + ", cil_mot=" + cil_mot + ", precio=" + precio + ", tecno=" + tecno + '}';
    }
    
    
}
