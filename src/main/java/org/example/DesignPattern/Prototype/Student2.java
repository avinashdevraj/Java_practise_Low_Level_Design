package org.example.DesignPattern.Prototype;

public class Student2 {
    String name,uniName,city;
    int age;
    String collegeName;

    public void setName(String name) {
        this.name = name;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public Student2(){

    }
    Student2(Student2 student){
        this.city=student.city;
        this.uniName=student.uniName;
        this.collegeName=student.collegeName;
    }
    public Student2 clone(){
        Student2 s= new Student2();
        return s;
    }
}
