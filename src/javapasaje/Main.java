package javapasaje;
public class Main {

    public static void main(String[] args) {
        
//Instanciamos los vuelos con sus respectivos parámetros utilizando los setter's

        Vuelo ida = new Vuelo();
        ida.setClase("Premium Diamond");
        ida.setLineaAerea("ANA");
        ida.setOrigen("EZE");
        ida.setDestino("NRT");
        ida.setHorarioSalida("10.37");
        ida.setHorarioLlegada("3.25");
        ida.setPrecio(1000);
        ida.setImpuestos(0);
        
        Vuelo vuelta = new Vuelo();
        vuelta.setClase("Premium Diamond");
        vuelta.setLineaAerea("ANA");
        vuelta.setOrigen("NRT");
        vuelta.setDestino("EZE");
        vuelta.setHorarioSalida("6.25");
        vuelta.setHorarioLlegada("8.50");
        vuelta.setPrecio(325);
        vuelta.setImpuestos(0);
        
        System.out.println(ida.mostrarDatos());
        System.out.println(vuelta.mostrarDatos());
        
        Pasaje pasaje = new Pasaje();
        pasaje.addVuelo(ida);
        pasaje.addVuelo(vuelta);
        
        System.out.println("Pasaje precio: " + pasaje.getPrecio());
    }    
}
