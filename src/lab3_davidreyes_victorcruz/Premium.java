package lab3_davidreyes_victorcruz;

public class Premium extends marcas_autos{
    String div_lujo;
    String div_dep;
    String tipocarroceria;

    public Premium(String div_lujo, String div_dep, String tipocarroceria, String nombre, String lema, String fundacion, int integracion, String fundador, double total, String ceo, int modelos) {
        super(nombre, lema, fundacion, integracion, fundador, total, ceo, modelos);
        this.div_lujo = div_lujo;
        this.div_dep = div_dep;
        this.tipocarroceria = tipocarroceria;
    }

    public Premium() {
    }

    public String getDiv_lujo() {
        return div_lujo;
    }

    public void setDiv_lujo(String div_lujo) {
        this.div_lujo = div_lujo;
    }

    public String getDiv_dep() {
        return div_dep;
    }

    public void setDiv_dep(String div_dep) {
        this.div_dep = div_dep;
    }

    public String getTipocarroceria() {
        return tipocarroceria;
    }

    public void setTipocarroceria(String tipocarroceria) {
        this.tipocarroceria = tipocarroceria;
    }

    @Override
    public String toString() {
        return "Premium{" + "div_lujo=" + div_lujo + ", div_dep=" + div_dep + ", tipocarroceria=" + tipocarroceria + '}';
    }
    
}
