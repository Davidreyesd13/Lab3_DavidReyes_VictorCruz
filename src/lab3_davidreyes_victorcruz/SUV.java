
package lab3_davidreyes_victorcruz;


public class SUV extends carroceria{
   boolean rodaje;
    int cantpasajeros;
    String nom_naveg;

    public SUV(boolean rodaje, int cantpasajeros, String nom_naveg) {
        this.rodaje = rodaje;
        this.cantpasajeros = cantpasajeros;
        this.nom_naveg = nom_naveg;
    }

    public SUV() {
    }

    public boolean isRodaje() {
        return rodaje;
    }

    public void setRodaje(boolean rodaje) {
        this.rodaje = rodaje;
    }

    public int getCantpasajeros() {
        return cantpasajeros;
    }

    public void setCantpasajeros(int cantpasajeros) {
        this.cantpasajeros = cantpasajeros;
    }

    public String getNom_naveg() {
        return nom_naveg;
    }

    public void setNom_naveg(String nom_naveg) {
        this.nom_naveg = nom_naveg;
    }

    @Override
    public String toString() {
        return "SUV{" + "rodaje=" + rodaje + ", cantpasajeros=" + cantpasajeros + ", nom_naveg=" + nom_naveg + '}';
    }
    
}
