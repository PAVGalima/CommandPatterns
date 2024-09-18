package adapterPattern;

public class LightsAdapter  implements RemoteControllerFunction{
    private Lights  lights;


    public LightsAdapter(Lights lights){
        this.lights = lights;
    }

    @Override
    public String powerOn() {
        return lights.switchOn();
    }

    @Override
    public String powerOff() {
        return lights.switchOff();
    }

    @Override
    public String pressPlusButton() {
        return lights.changeBrightnessUp();
    }

    @Override
    public String pressMinusButton() {
        return lights.changeBrightnessDown();
    }

}
