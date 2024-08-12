package org.example.DesignPattern.Observer;

public class InventoryService implements OnOrderPlaced{
    InventoryService(){
        Flipkart.register(this);
    }
    @Override
    public void onOrderPlace() {
        System.out.println("Maintaing Inventory");
    }
}
