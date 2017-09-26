package agencia;
import java.util.Date;
public class Travel {
    
    private Date start;
    private int duration;
    private BookedFlight outbound;
    private BookedFlight returnFlight;
    private Hotel hotel;
    
    public Travel(Date start, int duration, Hotel hotel, int flightNumberIda, Date departureIda, Date arrivalIda, Airport fromIda, Airport toIda, 
            int flightNumberVuelta, Date departureVuelta, Date arrivalVuelta, Airport fromVuelta, Airport toVuelta){
        this.start = start;
        this.duration = duration;
        BookedFlight outbound = new BookedFlight(flightNumberIda, departureIda, arrivalIda, fromIda, toIda);
        this.outbound = outbound;
        BookedFlight returnFlight = new BookedFlight(flightNumberVuelta, departureVuelta, arrivalVuelta, fromVuelta, toVuelta);
        this.returnFlight = returnFlight;
        this.hotel = hotel;
    }
    
    public Date getStart(){
        return start;
    }
    public int getDuration(){
        return duration;
    }
    public BookedFlight getOutbound(){
        return outbound;
    }
    public BookedFlight getReturnFlight(){
        return returnFlight;
    }

    public Hotel getHotel() {
        return hotel;
    }
    
    
}
