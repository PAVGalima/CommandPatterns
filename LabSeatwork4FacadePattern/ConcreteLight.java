package LabSeatwork4FacadePattern;

public class ConcreteLight implements HomeService {

    @Override
    public void turnOn(){
        System.out.println("Turn on all light");
    }
    @Override
    public void turnOff(){
        System.out.println("Turn off all light");
    }

}
