package org.example.ParkingLot.Repositories;

import org.example.ParkingLot.Model.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {
    //Gate Table will do CRUD operations on it
    private HashMap<Long, Gate> gates=new HashMap<>();

    public Optional<Gate> getGateById(long id){
        return Optional.of(gates.get(id));
    }
}
