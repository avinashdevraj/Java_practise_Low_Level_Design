package org.example.ImmutableclassDemo;

public   final class Employee {
    final String pancardNumber;
    public Employee(String pancardNumber)
    {
        this.pancardNumber=pancardNumber;
    }
    public String getPancardNumber(){
        return pancardNumber;
    }
}
