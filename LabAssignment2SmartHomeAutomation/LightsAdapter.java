public class LightsAdapter implements RemoteControl {

    public Lights light;
    
    public LightsAdapter(Lights light){
        this.light = light;
    }

    public String powerOn() {

        return light.lightsOn();
    }
    public String powerOff() {
        return light.lightsOff();
    }

    public String pressPlusButton() {
        return light.brightnessLevelHigh();
    }

    public String pressMinusButton() {
        return light.brightnessLevelLow();
    }


}
