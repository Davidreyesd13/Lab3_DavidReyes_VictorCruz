package lab3_davidreyes_victorcruz;

import java.util.ArrayList;

public class carroceria extends Modelos {
    ArrayList<Hatchback> hatchbacks;
    ArrayList<SUV> suvs;
    ArrayList<Sedan> sedans;

    public carroceria(ArrayList<Hatchback> hatchbacks, ArrayList<SUV> suvs, ArrayList<Sedan> sedans) {
        this.hatchbacks = hatchbacks;
        this.suvs = suvs;
        this.sedans = sedans;
    }

    public carroceria() {
    }

    public ArrayList<Hatchback> getHatchbacks() {
        return hatchbacks;
    }

    public void setHatchbacks(ArrayList<Hatchback> hatchbacks) {
        this.hatchbacks = hatchbacks;
    }

    public ArrayList<SUV> getSuvs() {
        return suvs;
    }

    public void setSuvs(ArrayList<SUV> suvs) {
        this.suvs = suvs;
    }

    public ArrayList<Sedan> getSedans() {
        return sedans;
    }

    public void setSedans(ArrayList<Sedan> sedans) {
        this.sedans = sedans;
    }

    @Override
    public String toString() {
        return "carroceria{" + "hatchbacks=" + hatchbacks + ", suvs=" + suvs + ", sedans=" + sedans + '}';
    }
    
    
}
