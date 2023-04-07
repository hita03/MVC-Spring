package mvc.com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mvc.com.example.model.*;

@Service
public interface TicketService {
	
    List < Ticket > getAllTickets();
    void saveTicket(Ticket ticket);
    Ticket getTicketById(String tid);
    void deleteTicketById(String tid);

}
