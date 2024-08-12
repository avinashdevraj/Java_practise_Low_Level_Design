package org.example.DesignPattern.Observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart=Flipkart.getInstance();
        EmailService emailService=new EmailService();
        InvoiceService invoiceService=new InvoiceService();
        InventoryService inventoryService=new InventoryService();
        flipkart.OnOrder();
        String s="Avinash";
        String[] x=s.split("");
        StringBuilder sb=new StringBuilder();
        sb.append('A');
        sb.append("Don");
        String p="Hi am go down";
        sb.append(p);
        System.out.println(sb.substring(0,3));
        System.out.println(sb.toString());
        System.out.println(x[0]);
    }
}
