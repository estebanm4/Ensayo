package agencia;

public class Hotel {
    
    private String name;
    private String adress;
    
    public Hotel(String name, String adress){
        this.name = name;
        this.adress = adress;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAdress(){
        return adress;
    }
}
