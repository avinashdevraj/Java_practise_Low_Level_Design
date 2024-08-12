package org.example.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCompare {
    public static void main(String[] args) {
        String input1 = "{\"state\":1,\"cmd\":1}";
        String input2 = "{\"cmd\":1,\"state\":1}";

       // ObjectMapper o=new ObjectMapper();
        int x=65;
        String z="0"+Integer.toString(x);
        System.out.println(z);
        int y=Integer.valueOf(z);
        System.out.println(y);
    }
}
