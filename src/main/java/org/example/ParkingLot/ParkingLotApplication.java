package org.example.ParkingLot;

import org.example.ParkingLot.Controller.TicketController;
import org.example.ParkingLot.Dtos.IssueTicketRequestDto;
import org.example.ParkingLot.Dtos.IssueTicketResponseDto;
import org.example.ParkingLot.Factories.ParkingSpotAssignmentStrategyFactory;
import org.example.ParkingLot.Model.ParkingSptAssignmentStrategyType;
import org.example.ParkingLot.Model.Ticket;
import org.example.ParkingLot.Repositories.GateRepository;
import org.example.ParkingLot.Repositories.VechileRepository;
import org.example.ParkingLot.Services.IssueTicket;
import org.example.ParkingLot.Strategies.ParkingSpotAssignmentStrategy;

public class ParkingLotApplication {
    public static void main(String[] args) {
        GateRepository gateRepository=new GateRepository();
        VechileRepository vechileRepository=new VechileRepository();
        ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy=
                ParkingSpotAssignmentStrategyFactory.getParkingLotStrategy(ParkingSptAssignmentStrategyType.NEAREST);
        IssueTicket issueTicket=new IssueTicket(gateRepository,vechileRepository,parkingSpotAssignmentStrategy);

        TicketController ticketController=new TicketController(issueTicket);

        IssueTicketRequestDto requestDto=new IssueTicketRequestDto();

        requestDto.setGateId(123L);
        requestDto.setOperatorId(11L);
        requestDto.setNumber("BR013162");

        IssueTicketResponseDto responseDto= ticketController.issueTicket(requestDto);

        Ticket ticket=responseDto.getTicket();
        System.out.println(ticket);
    }
}
