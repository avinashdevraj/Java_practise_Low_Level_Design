package org.example.DesignPattern.Builder;

public class Student {
    String name;
    String uniName;
    String address;
    int age;
    double psp;
    String phoneNumber;

//    void setName(String name){
//        this.name=name;
//    }
//    void setage(int age){
//        if(age<=22){
//            throw new RuntimeException("Invalid Age");
//        }
//        else{
//            this.age=age;
//        }
//    }


    //next create constructor then------

//    Student(String name,String uniName,String address,int age,double psp,String phoneNumber){
//        if(age<=22){
//           throw new RuntimeException("Invalid Age");
//        }
//        if(phoneNumber.length()!=10){
//            throw new RuntimeException("invalid Number");
//        }
//        this.name=name;
//        this.age=age;
//
//
//    }

    private Student(Builder builder){

        this.name=builder.name;
        this.uniName=builder.uniName;
        this.age=builder.age;
        this.phoneNumber=builder.phoneNumber;
    }

    public void setName(String avinash) {
    }

    public static class Builder {
        String name;
        String uniName;
        String address;
        int age;
        double psp;
        String phoneNumber;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUniName() {
            return uniName;
        }

        public Builder setUniName(String uniName) {
            this.uniName = uniName;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Student build(){
            if(this.getPhoneNumber()==null|| this.getPhoneNumber().length()!=10){
                throw new RuntimeException("sahi number dalo");
            }
            if(this.getAge()<22){
                throw new RuntimeException("Bhai sahab age to kam ya gal hai aapki");
            }
            return new Student(this);
        }
    }

    public static Builder getbuilder(){
        return new Builder();
    }


}
