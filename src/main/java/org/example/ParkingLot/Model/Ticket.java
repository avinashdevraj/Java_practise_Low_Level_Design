package org.example.ParkingLot.Model;

import java.util.Date;

public class Ticket extends BaseModel{
    private String number;
    private Date entryTime;
    private Veichle veichle;
    private ParkingSpot parkingSpot;
    private Gate gate;
    private Operator operator;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Veichle getVeichle() {
        return veichle;
    }

    public void setVeichle(Veichle veichle) {
        this.veichle = veichle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
