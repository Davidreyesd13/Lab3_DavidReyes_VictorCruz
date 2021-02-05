package lab3_davidreyes_victorcruz;

import java.util.ArrayList;


public class Hatchback extends carroceria{
int maletero;
double longitudtot;
int cantbol;

    public Hatchback(int maletero, double longitudtot, int cantbol, ArrayList<Hatchback> hatchbacks, ArrayList<SUV> suvs, ArrayList<Sedan> sedans) {
        super(hatchbacks, suvs, sedans);
        this.maletero = maletero;
        this.longitudtot = longitudtot;
        this.cantbol = cantbol;
    }

    public Hatchback() {
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public double getLongitudtot() {
        return longitudtot;
    }

    public void setLongitudtot(double longitudtot) {
        this.longitudtot = longitudtot;
    }

    public int getCantbol() {
        return cantbol;
    }

    public void setCantbol(int cantbol) {
        this.cantbol = cantbol;
    }

}
