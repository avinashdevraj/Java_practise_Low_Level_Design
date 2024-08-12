package org.example.DesignPattern.Observer;

public class EmailService implements OnOrderPlaced{

    EmailService(){
        Flipkart flipkart=Flipkart.getInstance();
        flipkart.register(this);

    }
    @Override
    public void onOrderPlace() {
        System.out.println("Sending Email");
    }
}
