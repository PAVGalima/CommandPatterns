public class TvAdapter implements RemoteControl {
    private Tv tv;

    public TvAdapter(Tv tv){
        this.tv = tv;
    }
    public String powerOn() {
        return tv.switchOn();
    }

  
    public String powerOff() {
        return tv.switchOff();
    }


    public String pressPlusButton() {
        return tv.changeChannelUp();
    }


    public String pressMinusButton() {
        return tv.changeChannelDown();
    }

}
