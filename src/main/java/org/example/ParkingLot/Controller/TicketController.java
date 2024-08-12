package org.example.ParkingLot.Controller;

import org.example.ParkingLot.Dtos.IssueTicketRequestDto;
import org.example.ParkingLot.Dtos.IssueTicketResponseDto;
import org.example.ParkingLot.Dtos.ResponseStatus;
import org.example.ParkingLot.Model.Ticket;
import org.example.ParkingLot.Services.IssueTicket;

public class TicketController {
    IssueTicket issueTicket;

    public TicketController(IssueTicket issueTicket) {
        this.issueTicket = issueTicket;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto){
        IssueTicketResponseDto responseDto=new IssueTicketResponseDto();
        try{
            Ticket ticket=issueTicket.issueTicket(requestDto.getNumber(),
                    requestDto.getGateId(),
                    requestDto.getOperatorId());
            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        }
        catch(Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILED);

        }
        return responseDto;

    }
}
