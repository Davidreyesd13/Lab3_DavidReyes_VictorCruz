package lab3_davidreyes_victorcruz;
import java.util.ArrayList;
public class fabricas extends coorporaciones{
    String nombrefab;
    String ubicacion;
    int cantm;
    String tipoc;
    int cantempleados;
    ArrayList<Marcas> nombrefabricas;
    int autos_fab;

    public fabricas() {
    }

    public fabricas(String nombrefab, String ubicacion, int cantm, String tipoc, int cantempleados, ArrayList<Marcas> nombrefabricas, int autos_fab, String nombre, String sede, int año, String ceo, int empleados, int autos, ArrayList marcas) {
        super(nombre, sede, año, ceo, empleados, autos, marcas);
        this.nombrefab = nombrefab;
        this.ubicacion = ubicacion;
        this.cantm = cantm;
        this.tipoc = tipoc;
        this.cantempleados = cantempleados;
        this.nombrefabricas = nombrefabricas;
        this.autos_fab = autos_fab;
    }



    public String getNombrefab() {
        return nombre;
    }

    public void setNombrefab(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantm() {
        return cantm;
    }

    public void setCantm(int cantm) {
        this.cantm = cantm;
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }

    public int getCantempleados() {
        return cantempleados;
    }

    public void setCantempleados(int cantempleados) {
        this.cantempleados = cantempleados;
    }

    public ArrayList<Marcas> getNombrefabricas() {
        return nombrefabricas;
    }

    public void setNombrefabricas(ArrayList<Marcas> nombrefabricas) {
        this.nombrefabricas = nombrefabricas;
    }

    public int getAutos_fab() {
        return autos_fab;
    }

    public void setAutos_fab(int autos_fab) {
        this.autos_fab = autos_fab;
    }

    @Override
    public String toString() {
        return "fabricas{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", cantm=" + cantm + ", tipoc=" + tipoc + ", cantempleados=" + cantempleados + ", nombrefabricas=" + nombrefabricas + ", autos_fab=" + autos_fab + '}';
    }
    
}
