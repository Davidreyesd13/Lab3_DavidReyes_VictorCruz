package lab3_davidreyes_victorcruz;
import java.util.ArrayList;
public class coorporaciones {
String nombre;
String sede;
int año;
String ceo;
int empleados;
int autos;
ArrayList<Marcas> marcas;

    public coorporaciones(String nombre, String sede, int año, String ceo, int empleados, int autos, ArrayList marcas) {
        this.nombre = nombre;
        this.sede = sede;
        this.año = año;
        this.ceo = ceo;
        this.empleados = empleados;
        this.autos = autos;
        this.marcas = marcas;
    }

    public coorporaciones(String nombre, String sede, int año, String ceo, int empleados, int autos) {
        this.nombre = nombre;
        this.sede = sede;
        this.año = año;
        this.ceo = ceo;
        this.empleados = empleados;
        this.autos = autos;
    }
    
    public coorporaciones() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getAutos() {
        return autos;
    }

    public void setAutos(int autos) {
        this.autos = autos;
    }

    public ArrayList getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList marcas) {
        this.marcas = marcas;
    }

    @Override
    public String toString() {
        return "coorporacion " + "nombre=" + nombre + ", sede=" + sede + ", a\u00f1o=" + año + ", ceo=" + ceo + ", empleados=" + empleados + ", autos=" + autos + ", marcas=" + marcas ;
    }


}
