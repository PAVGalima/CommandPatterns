package LabAssignment4FacadePattern;

public class HouseKeeping implements HotelService{

    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("Housekeeping cleaning room number: " + roomNumber);
    }

    @Override
    public void performService() {
        cleanRoom();
    }

}
