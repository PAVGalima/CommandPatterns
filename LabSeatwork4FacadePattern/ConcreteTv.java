package LabSeatwork4FacadePattern;

public class ConcreteTv implements HomeService{
    
    @Override
    public void turnOn(){
        System.out.println("Turn on all tv");
    }
    @Override
    public void turnOff(){
        System.out.println("Turn off all tv");
    }

}
