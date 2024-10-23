package LabAssignment4FacadePattern;

public class FrontDesk {

    public void requestValetService(String plateNumber) {
        HotelService valet = new Valet(plateNumber);
        valet.performService();
    }

    public void requestHousekeepingService(int roomNumber) {
        HotelService housekeeping = new HouseKeeping(roomNumber);
        housekeeping.performService();
    }

    public void requestCartService(int numberOfCarts) {
        HotelService cart = new Cart(numberOfCarts);
        cart.performService();
    }

}
