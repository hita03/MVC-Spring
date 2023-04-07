package mvc.com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import mvc.com.example.model.*;

public interface TicketRepository extends  JpaRepository<Ticket, String> {
	
	
}
