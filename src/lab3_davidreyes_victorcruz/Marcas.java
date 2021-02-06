package lab3_davidreyes_victorcruz;
import java.util.ArrayList;
public class Marcas  {
    ArrayList<marcas_autos> lista;

    public Marcas(ArrayList<marcas_autos> lista) {
       
        this.lista = lista;
    }

    public Marcas() {
    }

   
    
   

    public ArrayList<marcas_autos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<marcas_autos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Marcas"+ lista;
    }
    
}
