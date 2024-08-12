package org.example.FunctionalInterface;

import java.util.function.BiPredicate;

public class Bipredicatesimpl implements BiPredicate<String,Integer>{

    @Override
    public boolean test(String s, Integer val) {
        return s.length()>val;
    }
}
