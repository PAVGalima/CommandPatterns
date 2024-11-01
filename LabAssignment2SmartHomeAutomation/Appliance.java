

import java.util.Scanner;
/*
 * Galima Patrick Ace V.
 */
public class Appliance {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        Tv tv = new Tv();
        RemoteControl tvRc = new TvAdapter(tv);
    
        Lights light = new Lights();
        RemoteControl lightsRc =  new LightsAdapter(light);

        Aircon airCon = new Aircon();
        RemoteControl airConRc = new AirconAdapter(airCon);
    
        Speaker speaker = new Speaker();
        RemoteControl speakerRc = new SpeakerAdapter(speaker);
    
        //turn on the appliances
        System.out.println(tvRc.powerOn());
        System.out.println(lightsRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());
    
        System.out.println();
        //THIS IS IN A LOOP STATEMENT: APPLIANCES CAN SET TO HIGH OR LOW.
         //TV SET FOR CHANNELS.
        while(running){
            System.out.println("PRESS 1:[+]");
        System.out.println("PRESS 2:[-]");
        System.out.println("PRESS 3:[Exit]");
        Integer choice = scanner.nextInt();
               
        switch(choice){
            case 1:
            System.out.println(tvRc.pressPlusButton());
            System.out.println(lightsRc.pressPlusButton());
            System.out.println(airConRc.pressPlusButton());
            System.out.println(speakerRc.pressPlusButton());
            break;
            case 2:
            System.out.println(tvRc.pressMinusButton());
            System.out.println(lightsRc.pressMinusButton());
            System.out.println(airConRc.pressMinusButton());
            System.out.println(speakerRc.pressMinusButton());
            break;
            case 3:
            running = false;
            //APPLIANCE OFF
            System.out.println(tvRc.powerOff());
            System.out.println(lightsRc.powerOff());
            System.out.println(airConRc.powerOff());
            System.out.println(speakerRc.powerOff());
            System.out.println("APPLIANCE OFF");
        }
    }
    scanner.close();
        }
}
