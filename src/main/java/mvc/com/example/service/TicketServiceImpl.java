package mvc.com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.com.example.model.*;
import mvc.com.example.repository.*;


@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List < Ticket > getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        this.ticketRepository.save(ticket);
    }

    @Override
    public Ticket getTicketById(String tid) {
        Optional < Ticket > optional = ticketRepository.findById(tid);
        Ticket ticket = null;
        if (optional.isPresent()) {
            ticket = optional.get();
        } else {
            throw new RuntimeException(" Ticket not found for ID :: " + tid);
        }
        return ticket;
    }

    @Override
    public void deleteTicketById(String tid) {
        this.ticketRepository.deleteById(tid);
    }
	
	

}
