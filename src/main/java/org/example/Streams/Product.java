package org.example.Streams;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.stream()
                .filter(p ->p.price> 30000)   // filtering price
                .map(pm ->pm.price)          // fetching price
                .forEach(System.out::println);  // iterating price
        //sum of prices
        long count1=productsList.stream().count();
        System.out.println((int)count1);

        float sum=productsList.stream().map(product -> product.price).reduce(0F,Float::sum);
        float sum2=productsList.stream().map(product -> product.price).reduce(0.0f,(c,s)->c+s);
        System.out.println(sum+" "+sum2);

        //find max price
        float maxprice=productsList.stream().max((a,b)->a.price>b.price?1:-1).map(a->a.price).get();
        System.out.println(maxprice);

        //find average

        float average=productsList.stream().map(a->a.price).count();
    }
}