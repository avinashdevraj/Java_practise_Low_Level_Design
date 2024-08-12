package org.example.DesignPattern.Prototype;

import java.util.HashMap;

public class Registry {
    HashMap<String,Student2> map=new HashMap<>();

    public void register(String key,Student2 value){
          map.put(key,value);
    }
    public Student2 getValue(String key){
        return map.get(key);
    }
}
