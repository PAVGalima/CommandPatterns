package adapterPattern;
/*
 * Galima Patrick Ace V
 * Assignment 2 Command Patterns:
 */
import java.util.*;
public class ApplianceApp {

    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            boolean running = true;

        Tv tv = new Tv();
        RemoteControllerFunction tvRc = new TvAdapter(tv);

        Lights  lights = new Lights();
        RemoteControllerFunction lightsRc = new  LightsAdapter(lights);

        AirCon airCon = new AirCon();
        RemoteControllerFunction airConRc = new AirconAdapter(airCon);

        Speaker speaker = new Speaker();
        RemoteControllerFunction speakerRc = new SpeakerAdapter(speaker);

        System.out.println();
        System.out.println(lightsRc.powerOn());
        System.out.println(tvRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());
        System.out.println();

          while(running){
      System.out.println();
        System.out.println("TURN UP APPLIANCE: [PRESS: 1]");
        System.out.println("TURN DOWN APPLIANCE: [PRESS: 2]");
        System.out.println("TURN OFF APPLIANCE: [PRESS: 3]");
        System.out.println();
        Integer remote = scanner.nextInt();
        switch(remote){
            case 1: //turn UP APPLIANCE
            System.out.println(lightsRc.pressPlusButton());
            System.out.println(tvRc.pressPlusButton());
            System.out.println(airConRc.pressPlusButton());
            System.out.println(speakerRc.pressPlusButton());

        break;

        case 2 : //turn DOWN UPPLIANCE
        System.out.println(lightsRc.pressMinusButton());
        System.out.println(tvRc.pressMinusButton());
        System.out.println(airConRc.pressMinusButton());
        System.out.println(speakerRc.pressMinusButton());

        break;

        case 3:
           //press button powerOff
           System.out.println(lightsRc.powerOff());
           System.out.println(tvRc.powerOff());
           System.out.println(airConRc.powerOff());
           System.out.println(speakerRc.powerOff());
           running = false;
           break;
        } 
          }
          scanner.close();
}
}
