package agencia;
import java.util.ArrayList;
import java.util.Date;

public class TravelAgency {
    
    private String name;
    private ArrayList<Hotel> knowHotels;
    private ArrayList<Airport> airports;
    private ArrayList<Travel> offeredTravels;
    
    public TravelAgency(String name){
        this.name = name;
        this.knowHotels = new ArrayList();
        this.airports = new ArrayList();
        this.offeredTravels = new ArrayList();
    }
    
    private int tamHotel = knowHotels.size();
    private int tamAero = airports.size();
    private int tamViaje = offeredTravels.size();
    
    public String getName(){
        return name;
    }
    private int posHotel;
    public Hotel getKnowHotels(){
        return knowHotels.get(posHotel);
    }
    
    private int posAero;
    public Airport getAirports(){
        return airports.get(posAero);
    }
    private int posViaje;
    public Travel getOfferedTravels(){
        return offeredTravels.get(posViaje);
    }
    
    public void addHotel(String nameHotel, String adressHotel){
        if(tamHotel < 5){
            Hotel nuevoHotel = new Hotel (nameHotel, adressHotel);
        knowHotels.add(nuevoHotel);
        } else {
            System.out.println("Ha alcanzado al número máximo de hoteles");
        }
         
    }
    
    public void addAero(String description){
        if( tamAero < 4){
            Airport nuevoAero = new Airport(description);
            airports.add(nuevoAero);
        } else {
            System.out.println("Ha alcanzado el número máximo de aeropuertos");
        }
    }
    
    public void addTravel(Date start, int duration, Hotel hotel, int flightNumberIda, Date departureIda, Date arrivalIda, Airport fromIda, Airport toIda, 
            int flightNumberVuelta, Date departureVuelta, Date arrivalVuelta, Airport fromVuelta, Airport toVuelta){
        if( tamViaje < 10){
        Travel nuevoViaje = new Travel(start, duration, hotel, flightNumberIda, departureIda, arrivalIda, fromIda, toIda, flightNumberVuelta, departureVuelta,arrivalVuelta, fromVuelta, toVuelta);
        offeredTravels.add(nuevoViaje);
        } else {
            System.out.println("Ha alcanzado el número máximo de viajes ofrecidos");
        }
    }
    
    public String listarHoteles() {
        String info = "";
        for (int i = 0; i < knowHotels.size(); i++) {
            info += "Info. Hotel " + (i+1) + "\n";
            info += "Nombre " + knowHotels.get(i).getName();
            info += "Dirección: " + knowHotels.get(i).getAdress() + "\n";
        }
        return info;
    }
    
    public String listarAero(){
        String aero = "";
        for(int s = 0; s < airports.size(); s++){
            aero += "Info. Aeropuerto No. " + (s+1) + "\n";
            aero += "Nombre " + airports.get(s).getDescription() + "\n";
        }
        return aero;
    }
    
    public String listarViaje(){
        String viaje = "";
        for(int k = 0; k < offeredTravels.size(); k++){
            viaje += "Info. Viaje No. " + (k+1) + "\n";
            viaje += "Fecha Inicio: " + offeredTravels.get(k).getStart();
            viaje += "Duración del Vuelo : " + offeredTravels.get(k).getDuration() + " minutos.";
            viaje += "Datos del Vuelo de Ida: " + offeredTravels.get(k).getOutbound();
            viaje += "Numero de vuelo: " + offeredTravels.get(k).getOutbound().getFlightNumber();
            viaje += "Fecha de Despegue: " + offeredTravels.get(k).getOutbound().getDeparture();
            viaje += "Fecha de Aterrizaje: " + offeredTravels.get(k).getOutbound().getArrival();
            viaje += "Aeropuerto Salida: " + offeredTravels.get(k).getOutbound().getFrom();
            viaje += "Aeropuerto Llegada: " + offeredTravels.get(k).getOutbound().getTo();
            viaje += "Datos del Vuelo de Regreso: " + offeredTravels.get(k).getReturnFlight();
            viaje += "Numero de vuelo: " + offeredTravels.get(k).getReturnFlight().getFlightNumber();
            viaje += "Fecha de Despegue: " + offeredTravels.get(k).getReturnFlight().getDeparture();
            viaje += "Fecha de Aterrizaje: " + offeredTravels.get(k).getReturnFlight().getArrival();
            viaje += "Aeropuerto Salida: " + offeredTravels.get(k).getReturnFlight().getFrom();
            viaje += "Aeropuerto Llegada: " + offeredTravels.get(k).getReturnFlight().getTo();
            viaje += "Hotel de Hospedaje: " + offeredTravels.get(k).getHotel();
        }
        return viaje;
    }
    
    public String listarDatos(){
        String datos = "";
        for(int y = 0; y < offeredTravels.size(); y++){
            datos += "Info. No. " + (y+1) + ":\n";
            datos += "Número de vuelo de Salida: " + offeredTravels.get(y).getOutbound().getFlightNumber();
            datos += "Nombre Aeropuerto de Salida: " + offeredTravels.get(y).getOutbound().getFrom();
            datos += "Número de vuelo de Retorno: " + offeredTravels.get(y).getReturnFlight().getFlightNumber();
            datos += "Nombre Aeropuerto de Llegada: " + offeredTravels.get(y).getOutbound().getTo();
            
        }
        return datos;
    }
}
