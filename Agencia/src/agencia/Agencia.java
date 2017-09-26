package agencia;
import java.util.*;


public class Agencia {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido al menú de creación de agencias de viaje" + ":\n");
        
        //ystem.out.println("Para iniciar, cree la agencia de viajes" + ":\n");
        
        System.out.println("Ingrese el nombre de la agencia" + ":\n");
        String nombreAgencia = in.next();
        
        System.out.println("Ahora, crearemos el primer Hotel" + ":\n");
        System.out.println("Ingrese el nombre del Hotel");
        System.out.println("Ingrese la dirección del Hotel");
        String nomHotel = in.next();
        String dirHotel = in.next();
        Hotel hotel1 = new Hotel(nomHotel, dirHotel);
        TravelAgency agencia1 = new TravelAgency (nombreAgencia);
        agencia1.addHotel(nomHotel, dirHotel);
        System.out.println("** EL HOTEL SE HA CREADO SATISFACTORIAMENTE **" + ":\n");
        System.out.println("Ahora, es necesario crear dos aeropuertos" + ":\n");
        System.out.println("Ingrese el nombre del primer aeropuerto, usando guiones en lugar de espacios");
        System.out.println("Ingrese el nombre del segundo aeropuerto, usando guiones en lugar de espacios");
        String nomAero1 = in.next();
        String nomAero2 = in.next();
        Airport aero1 = new Airport(nomAero1);
        Airport aero2 = new Airport(nomAero2);
        agencia1.addAero(nomAero1);
        agencia1.addAero(nomAero2);
        System.out.println("** LOS AEROPUERTOS HAN SIDO CREADOS SATISFACTORIAMENTE" + ":\n");
        System.out.println("Ahora, crearemos el primer viaje que ofrece la agencia");  
        System.out.println("Ingrese el día de inicio");
        int dia = in.nextInt();
        System.out.println("Ingrese el mes de inicio");
        int mes = in.nextInt();
        System.out.println("Ingrese el año de inicio");
        int año = in.nextInt();
        Date inicio = new Date(dia, mes, año);
        System.out.println("Ingrese la duración del vuelo (En minutos)");
        int duracion = in.nextInt();
        System.out.println("Ingrese el nombre del Hotel");
        String nombHotel = in.next();
        System.out.println("Ahora, enfoquémonos en el vuelo de ida");
        System.out.println("Ingrese el número de vuelo de ida");
        int vueloIda = in.nextInt();
        System.out.println("Ingrese el día de despegue de ida");
        int diaIdaDes = in.nextInt();
        System.out.println("Ingrese el mes de despegue de ida");
        int mesIdaDes = in.nextInt();
        System.out.println("Ingrese el año de despegue ida");
        int añoIdaDes = in.nextInt();
        Date inicioIdaDes = new Date(diaIdaDes, mesIdaDes, añoIdaDes);
        System.out.println("Ingrese el día de aterrizaje de ida");
        int diaIdaAt = in.nextInt();
        System.out.println("Ingrese el mes de aterrizaje de ida");
        int mesIdaAt = in.nextInt();
        System.out.println("Ingrese el año de aterrizaje de ida");
        int añoIdaAt = in.nextInt();
        Date inicioIdaAt = new Date(diaIdaAt, mesIdaAt, añoIdaAt);
        System.out.println("Ingrese el aeropuerto del cual saldrá el avión de ida");
        String aeroSalIda = in.next();
        System.out.println("Ingrese el aeropuesto al cual llegará el avión de ida");
        String aeroAtIda = in.next();
        BookedFlight outbound1 = new BookedFlight (vueloIda, inicioIdaDes, inicioIdaAt, aero1, aero2);
        System.out.println("Ahora, enfoquémonos en el vuelo de regreso");
        System.out.println("Ingrese el número de vuelo de regreso");
        int vueloRegreso = in.nextInt();
        System.out.println("Ingrese el día de despegue de regreso");
        int diaRegDes = in.nextInt();
        System.out.println("Ingrese el mes de despegue de regreso");
        int mesRegDes = in.nextInt();
        System.out.println("Ingrese el año de despegue regreso");
        int añoRegDes = in.nextInt();
        Date inicioRegDes = new Date(diaRegDes, mesRegDes, añoRegDes);
        System.out.println("Ingrese el día de aterrizaje de regreso");
        int diaRegAt = in.nextInt();
        System.out.println("Ingrese el mes de aterrizaje de regreso");
        int mesRegAt = in.nextInt();
        System.out.println("Ingrese el año de aterrizaje de regreso");
        int añoRegAt = in.nextInt();
        Date inicioRegAt = new Date(diaRegAt, mesRegAt, añoRegAt);
        BookedFlight returnFlight1 = new BookedFlight(vueloRegreso, inicioRegDes, inicioRegAt, aero2, aero1);
        Travel travel1 = new Travel(inicio, duracion, hotel1, vueloIda, inicioIdaDes, inicioIdaAt, aero1, aero2, vueloRegreso, inicioRegDes, inicioRegAt, aero2, aero1);
        agencia1.addTravel(inicio, duracion, hotel1, vueloIda, inicioIdaDes, inicioIdaAt, aero1, aero2, vueloRegreso, inicioRegDes, inicioRegAt, aero2, aero1);
        
        System.out.println(agencia1);
        int continuar = 1;
        do{
        System.out.println("Digite el número de la opción que desea elegir:");
        System.out.println("1. Ingresar Hotel");
        System.out.println("2. Ingresar Oferta de Viaje");
        System.out.println("3. Ingresar Aeropuerto");
        System.out.println("4. Listar Hoteles registrados");
        System.out.println("5. Listar Viajes Ofrecidos");
        System.out.println("6. Listar Aeropuertos registrados");
        System.out.println("7. Listar Datos Predeterminados");
        int decision = in.nextInt();
        
        switch(decision){
            case 1:
                System.out.println("Ingrese el nombre del Hotel");
                System.out.println("Ingrese la dirección del Hotel");
                String nombreHotel = in.next();
                String direccionHotel = in.next();
                agencia1.addHotel(nombreHotel,direccionHotel);
                break;
            case 2:
                System.out.println("Ingrese el día de inicio");
                int dia1 = in.nextInt();
                System.out.println("Ingrese el mes de inicio");
                int mes1 = in.nextInt();
                System.out.println("Ingrese el año de inicio");
                int año1 = in.nextInt();
                Date inicio1 = new Date(dia, mes, año);
                System.out.println("Ingrese la duración del vuelo (En minutos)");
                int duracion1 = in.nextInt();
                System.out.println("Ingrese el nombre del Hotel");
                String nombHotel1 = in.next();
                System.out.println("Ahora, enfoquémonos en el vuelo de ida");
                System.out.println("Ingrese el número de vuelo de ida");
                int vueloIda1 = in.nextInt();
                System.out.println("Ingrese el día de despegue de ida");
                int diaIdaDes1 = in.nextInt();
                System.out.println("Ingrese el mes de despegue de ida");
                int mesIdaDes1  = in.nextInt();
                System.out.println("Ingrese el año de despegue ida");
                int añoIdaDes1 = in.nextInt();
                Date inicioIdaDes1 = new Date(diaIdaDes, mesIdaDes, añoIdaDes);
                System.out.println("Ingrese el día de aterrizaje de ida");
                int diaIdaAt1 = in.nextInt();
                System.out.println("Ingrese el mes de aterrizaje de ida");
                int mesIdaAt1 = in.nextInt();
                System.out.println("Ingrese el año de aterrizaje de ida");
                int añoIdaAt1 = in.nextInt();
                Date inicioIdaAt1 = new Date(diaIdaAt, mesIdaAt, añoIdaAt);
                System.out.println("Ingrese el aeropuerto del cual saldrá el avión de ida");
                String aeroSalIda1 = in.next();
                System.out.println("Ingrese el aeropuesto al cual llegará el avión de ida");
                String aeroAtIda1 = in.next();
                Airport aero3 = new Airport (aeroSalIda1);
                Airport aero4 = new Airport (aeroAtIda1);
                BookedFlight outbound2 = new BookedFlight (vueloIda1, inicioIdaDes1, inicioIdaAt1, aero3, aero4);
                System.out.println("Ahora, enfoquémonos en el vuelo de regreso");
                System.out.println("Ingrese el número de vuelo de regreso");
                int vueloRegreso1 = in.nextInt();
                System.out.println("Ingrese el día de despegue de regreso");
                int diaRegDes1 = in.nextInt();
                System.out.println("Ingrese el mes de despegue de regreso");
                int mesRegDes1 = in.nextInt();
                System.out.println("Ingrese el año de despegue regreso");
                int añoRegDes1 = in.nextInt();
                Date inicioRegDes1 = new Date(diaRegDes, mesRegDes, añoRegDes);
                System.out.println("Ingrese el día de aterrizaje de regreso");
                int diaRegAt1 = in.nextInt();
                System.out.println("Ingrese el mes de aterrizaje de regreso");
                int mesRegAt1 = in.nextInt();
                System.out.println("Ingrese el año de aterrizaje de regreso");
                int añoRegAt1 = in.nextInt();
                Date inicioRegAt1 = new Date(diaRegAt, mesRegAt, añoRegAt);
                BookedFlight returnFlight2 = new BookedFlight(vueloRegreso1, inicioRegDes1, inicioRegAt1, aero4, aero3);
                Travel travel2 = new Travel(inicio, duracion, hotel1, vueloIda, inicioIdaDes, inicioIdaAt, aero3, aero4, vueloRegreso, inicioRegDes, inicioRegAt, aero2, aero1);
                agencia1.addTravel(inicio, duracion, hotel1, vueloIda, inicioIdaDes, inicioIdaAt, aero4, aero3, vueloRegreso, inicioRegDes, inicioRegAt, aero2, aero1);
                break;
            case 3:
                System.out.println("Ingrese el nombre del aeropuerto");
                String nomAer = in.next();
                agencia1.addAero(nomAer);
                break;
            case 4:
                System.out.println(agencia1.listarHoteles());
                break;
            case 5:
                System.out.println(agencia1.listarViaje());
                break;
            case 6: 
                System.out.println(agencia1.listarAero());
                break;
            case 7:
                System.out.println(agencia1.listarDatos());
                break;
        }
    } while (continuar == 1);
}
}