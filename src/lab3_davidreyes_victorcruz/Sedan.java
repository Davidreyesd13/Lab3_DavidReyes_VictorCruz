package lab3_davidreyes_victorcruz;

import java.util.ArrayList;

public class Sedan extends carroceria{
    boolean androidplay;
    boolean androidauto;
    int cantasis;

    public Sedan() {
    }

    public Sedan(boolean androidplay, boolean androidauto, int cantasis, ArrayList<Hatchback> hatchbacks, ArrayList<SUV> suvs, ArrayList<Sedan> sedans) {
        super(hatchbacks, suvs, sedans);
        this.androidplay = androidplay;
        this.androidauto = androidauto;
        this.cantasis = cantasis;
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

    public int getCantasis() {
        return cantasis;
    }

    public void setCantasis(int cantasis) {
        this.cantasis = cantasis;
    }

    @Override
    public String toString() {
        return "Sedan{" + "androidplay=" + androidplay + ", androidauto=" + androidauto + ", cantasis=" + cantasis + '}';
    }
    
}
