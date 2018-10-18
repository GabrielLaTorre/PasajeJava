package javapasaje;
import java.util.ArrayList;
public class Pasaje {
    
    protected ArrayList<Vuelo> vueloLista;
    protected String agente;
    
public Pasaje() {
        vueloLista = new ArrayList<Vuelo>();
    }
    
    public void addVuelo(Vuelo vuelo){
        vueloLista.add(vuelo);
    }
    
    public void removeVuelo(Vuelo vuelo){
        vueloLista.remove(vuelo);
    }
    
    public double getPrecio(){
        //Por cada vuelo del array sumar el precio
        double precio = 0;
        for(int index=0; index < vueloLista.size(); index++){
            //Creamos la variable vuelo y lo sacamos del array
            Vuelo vuelo = vueloLista.get(index);
            precio = precio + vuelo.getPrecioTotal();
        }
        
        return precio;
  }    
}



