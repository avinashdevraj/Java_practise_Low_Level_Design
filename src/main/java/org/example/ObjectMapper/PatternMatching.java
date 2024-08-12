package org.example.ObjectMapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        String regexp="[a-zA-Z0-9.]+[a-zA-Z0-9@]+[a-z0-9./]+[a-z]";
        String s="www.geegksforgeegs@learn24/7.com";
        Pattern p=Pattern.compile(regexp);
        Matcher m=p.matcher(s);
        System.out.println(m.matches());
    }
}
