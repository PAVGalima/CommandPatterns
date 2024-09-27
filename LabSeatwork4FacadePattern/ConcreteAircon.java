package LabSeatwork4FacadePattern;

public class ConcreteAircon implements HomeService {
    @Override
    public void turnOn(){
        System.out.println("Turn on all AirConditioning");
    }
    @Override
    public void turnOff(){
        System.out.println("Turn off all AirConditioning");
    }


}
