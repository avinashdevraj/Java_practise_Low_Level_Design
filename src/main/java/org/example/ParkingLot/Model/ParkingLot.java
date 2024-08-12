package org.example.ParkingLot.Model;

import java.util.List;
import java.util.PrimitiveIterator;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gateList;
    private List<VeicleType> veicleTypeList;
    private ParkingLotStatus parkingLotStatus;

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public List<VeicleType> getVeicleTypeList() {
        return veicleTypeList;
    }

    public void setVeicleTypeList(List<VeicleType> veicleTypeList) {
        this.veicleTypeList = veicleTypeList;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
