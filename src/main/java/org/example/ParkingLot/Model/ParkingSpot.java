package org.example.ParkingLot.Model;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int spotNumber;
    private ParkingFloor parkingFloor;
    private ParkingSpotStatus parkingSpotStatus;
    private List<VeicleType> supportedVeihcle;

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public List<VeicleType> getSupportedVeihcle() {
        return supportedVeihcle;
    }

    public void setSupportedVeihcle(List<VeicleType> supportedVeihcle) {
        this.supportedVeihcle = supportedVeihcle;
    }
}
