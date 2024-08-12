package org.example.ParkingLot.Model;

public class Veichle extends BaseModel{

    private String number;
    private String ownerName;
    private VeicleType veicleType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VeicleType getVeicleType() {
        return veicleType;
    }

    public void setVeicleType(VeicleType veicleType) {
        this.veicleType = veicleType;
    }
}
