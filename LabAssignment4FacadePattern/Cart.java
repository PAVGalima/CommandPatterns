package LabAssignment4FacadePattern;

public class Cart implements HotelService {
    
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println("Cart service providing " + numberOfCarts + " luggage cart(s)");
    }

    @Override
    public void performService() {
        requestCart();
    }

}
