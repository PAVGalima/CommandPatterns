public class AirconAdapter implements RemoteControl{

    public Aircon airCon;

    public AirconAdapter(Aircon airCon){
        this.airCon = airCon;
    }

    @Override
    public String powerOn() {
        return airCon.turnOn();
    }

    @Override
    public String powerOff() {
        return airCon.turnOff();
    }

    @Override
    public String pressPlusButton() {
        return airCon.tempUp();
    }

    @Override
    public String pressMinusButton() {
        return airCon.tempDown();
    }
}
