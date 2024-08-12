package org.example.ParkingLot.Strategies;

import org.example.ParkingLot.Model.ParkingLot;
import org.example.ParkingLot.Model.ParkingSpot;
import org.example.ParkingLot.Model.Veichle;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot spotAssignment(ParkingLot parkingLot, Veichle veichle);
}
