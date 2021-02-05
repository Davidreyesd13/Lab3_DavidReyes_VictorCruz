package lab3_davidreyes_victorcruz;

import java.util.ArrayList;

public class Sedan extends carroceria{
    boolean androidplay;
    boolean androidauto;
    ArrayList<String> tipoasis;
    
    public Sedan() {
    }

    public Sedan(boolean androidplay, boolean androidauto,ArrayList tipoasis , ArrayList<Hatchback> hatchbacks, ArrayList<SUV> suvs, ArrayList<Sedan> sedans) {
        super(hatchbacks, suvs, sedans);
        this.androidplay = androidplay;
        this.androidauto = androidauto;
        this.tipoasis = tipoasis;
    }

    public boolean isAndroidplay() {
        return androidplay;
    }

    public void setAndroidplay(boolean androidplay) {
        this.androidplay = androidplay;
    }

    public boolean isAndroidauto() {
        return androidauto;
    }

    public void setAndroidauto(boolean androidauto) {
        this.androidauto = androidauto;
    }

    public ArrayList getCantasis() {
        return tipoasis;
    }

    public void setCantasis(ArrayList  tipoasis) {
        this.tipoasis = tipoasis;
    }

    @Override
    public String toString() {
        return "Sedan{" + "androidplay=" + androidplay + ", androidauto=" + androidauto + ", cantasis=" + tipoasis + '}';
    }
    
}
