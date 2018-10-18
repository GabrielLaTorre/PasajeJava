package javapasaje;
import java.util.ArrayList;

public class Vuelo {
    
    protected String lineaAerea;
    protected String origen;
    protected String destino;
    protected String horarioSalida;
    protected String horarioLlegada;
    protected String espera;
    protected String clase;
    protected double precio;
    protected double impuestos;

    public Vuelo() {
    }
    
    public double getPrecioTotal(){
        return precio + impuestos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    public String getEspera() {
        return espera;
    }

    public void setEspera(String espera) {
        this.espera = espera;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }


    public String getLineaAerea() {
        return lineaAerea;
    }

    public void setLineaAerea(String lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Utilizo un "acumulador" para poder agrupar los datos en una sola variable e imprimirlos
    public String mostrarDatos(){
       String acumulador = "";
        
       acumulador = acumulador + "Clase: " + getClase() + "\n";
       acumulador = acumulador + "Linea area: " + getLineaAerea()+ "\n";
       acumulador = acumulador + "Origen: " + getOrigen()+ "\n";
       acumulador = acumulador + "Destino: " + getDestino()+ "\n";
       acumulador = acumulador + "Salida: " + getHorarioSalida()+ "\n";
       acumulador = acumulador + "Llegada: " + getHorarioLlegada()+ "\n";
       
       return acumulador;
    }   
}
