package lab3_davidreyes_victorcruz;

import java.util.ArrayList;

public class mat_tec{
    String div_tec;
    int añocreacion;
    String campo;
    ArrayList<String> tecdesa;

    public mat_tec(String div_tec, int añocreacion, String campo, ArrayList<String> tecdesa) {
        this.div_tec = div_tec;
        this.añocreacion = añocreacion;
        this.campo = campo;
        this.tecdesa = tecdesa;
    }
 
    public mat_tec() {
    }

    public String getDiv_tec() {
        return div_tec;
    }

    public void setDiv_tec(String div_tec) {
        this.div_tec = div_tec;
    }

    public int getAñocreacion() {
        return añocreacion;
    }

    public void setAñocreacion(int añocreacion) {
        this.añocreacion = añocreacion;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public ArrayList<String> getTecdesa() {
        return tecdesa;
    }

    public void setTecdesa(ArrayList<String> tecdesa) {
        this.tecdesa = tecdesa;
    }


    @Override
    public String toString() {
        return "mat_tec{" + "div_tec=" + div_tec + ", a\u00f1ocreacion=" + añocreacion + ", campo=" + campo + ", tecdesa=" + tecdesa + '}';
    }
    
}
