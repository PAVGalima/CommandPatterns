package LabAssignment4FacadePattern;
/*
 * 
 * Galima Patrick Ace V.
 * LabAssignment 4 FacadePattern
 */
public class HotelApp {
    public static void main(String[] args) {
        
        FrontDesk frontDesk = new FrontDesk();
        // Simulate hotel services
        System.out.println();
        frontDesk.requestValetService("Galima-32118");
        System.out.println();
        frontDesk.requestHousekeepingService(18);
        System.out.println();
        frontDesk.requestCartService(18);
    }

}
