package LabSeatwork4FacadePattern;
/*
 * Galima Patrick Ace
 * 
 */
public class HomeApp {
    public static void main(String args[]){

        HomeService lightHomeService = new ConcreteLight();
        HomeInterface lightFacade = new HomeInterface(lightHomeService);

        HomeService tvHomeService = new ConcreteTv();
        HomeInterface tvFacade = new HomeInterface(tvHomeService);

        HomeService airConService = new ConcreteAircon();
        HomeInterface airConFacade = new HomeInterface(airConService);

        System.out.println();
        //TURN ON ALL APPLIANCE;
        tvFacade.turnOnAll();
        airConFacade.turnOnAll();
        lightFacade.turnOnAll();

        System.out.println();
        //TURN OFF ALL APPLIANCE;
        tvFacade.turnOffAll();
        airConFacade.turnOffAll();
        lightFacade.turnOffAll();
     

    }

}
