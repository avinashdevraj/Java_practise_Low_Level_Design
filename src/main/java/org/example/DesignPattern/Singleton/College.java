package org.example.DesignPattern.Singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class College {
    private static College college=null;
    private String name;
    private String location;
    private Long establishedYear;
    static Lock lock=new ReentrantLock();
    public static College getInstance(){
        if(college==null){
            lock.lock();
            if(college==null)
               college=new College();
            lock.unlock();
        }

        return college;
    }

    private College(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(Long establishedYear) {
        this.establishedYear = establishedYear;
    }
}
