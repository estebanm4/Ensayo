package agencia;
import java.util.Date;

public class BookedFlight {
    
    private int flightNumber;
    private Date departure;
    private Date arrival;
    private Airport from;
    private Airport to;
    
    public BookedFlight (int flightNumber, Date departure, Date arrival, Airport from, Airport to){
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
    }
    
    public int getFlightNumber(){
        return flightNumber;
    }
    
    public Date getDeparture(){
        return departure;
    }
    
    public Date getArrival(){
        return arrival;
    }
    
    public Airport getFrom(){
        return from;
    }
    
    public Airport getTo(){
        return to;
    }

}
