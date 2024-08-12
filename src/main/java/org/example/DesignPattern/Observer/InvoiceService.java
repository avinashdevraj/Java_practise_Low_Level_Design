package org.example.DesignPattern.Observer;

public class InvoiceService implements OnOrderPlaced{
    InvoiceService(){
        Flipkart flipkart=Flipkart.getInstance();
        flipkart.register(this);
    }
    @Override
    public void onOrderPlace() {
        System.out.println("Generating Invoice");
    }
}
