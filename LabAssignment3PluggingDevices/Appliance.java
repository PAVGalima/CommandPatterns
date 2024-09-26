package LabAssignment3PluggingDevices;
/*
 * GALIMA PATRICK ACE V.
 * LAB ASSIGNMENT 3
 */;

public class Appliance {
    public static void main(String args[]){


        Laptop laptop = new Laptop();
        PowerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigPowerOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneC = new SmartphoneAdapter(smartphoneCharger);


        //ALL APPLIANCE IS CHARGING
        System.out.println();
        System.out.println(laptopPowerOutlet.plugIn());
        System.out.println();
        System.out.println(refrigPowerOutlet.plugIn());
        System.out.println();
        System.out.println(smartphoneC.plugIn());

    }

}
