package org.example.ParkingLot.Factories;

import org.example.ParkingLot.Model.ParkingSptAssignmentStrategyType;
import org.example.ParkingLot.Strategies.CheapestSpotAssignmentStrategy;
import org.example.ParkingLot.Strategies.ParkingSpotAssignmentStrategy;

public class ParkingSpotAssignmentStrategyFactory {
    public static ParkingSpotAssignmentStrategy getParkingLotStrategy(ParkingSptAssignmentStrategyType parkingSptAssignmentStrategyType){
          if(parkingSptAssignmentStrategyType.equals(ParkingSptAssignmentStrategyType.NEAREST)){
              return new CheapestSpotAssignmentStrategy();
          } else if (parkingSptAssignmentStrategyType.equals(ParkingSptAssignmentStrategyType.CHEAPEST)) {
              return new CheapestSpotAssignmentStrategy();
          }
          else
              return null;
    }
}
