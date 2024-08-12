package org.example.ParkingLot.Services;

import org.example.ParkingLot.Exceptions.GateNotFoundException;
import org.example.ParkingLot.Model.Gate;
import org.example.ParkingLot.Model.ParkingLot;
import org.example.ParkingLot.Model.Ticket;
import org.example.ParkingLot.Model.Veichle;
import org.example.ParkingLot.Repositories.GateRepository;
import org.example.ParkingLot.Repositories.VechileRepository;
import org.example.ParkingLot.Strategies.ParkingSpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class IssueTicket {
    private GateRepository gateRepository;
    private VechileRepository vechileRepository;
    private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;

    public IssueTicket(GateRepository gateRepository, VechileRepository vechileRepository, ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy) {
        this.gateRepository = gateRepository;
        this.vechileRepository = vechileRepository;
        this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
    }

    public Ticket issueTicket(String number, long gateId, long operatorId) throws GateNotFoundException {
        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate=gateRepository.getGateById(gateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Invalid Gate Id");
        }
        Gate gate=optionalGate.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());


        Optional<Veichle> optionalVeichle=vechileRepository.findByNumber(number);

        Veichle veichle=new Veichle();
        Veichle savedVeichel=null;
        if(optionalVeichle.isEmpty()){

            veichle.setNumber(number);

            savedVeichel=vechileRepository.save(veichle);

        }
        else{
            savedVeichel=optionalVeichle.get();
        }
        ticket.setVeichle(savedVeichel);

        ParkingLot parkingLot=gate.getParkingLot();
        ticket.setParkingSpot(parkingSpotAssignmentStrategy.spotAssignment(parkingLot,veichle));

        return ticket;
    }
}
