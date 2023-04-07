package mvc.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import mvc.com.example.model.*;
import mvc.com.example.service.*;



@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    // display list of tickets -> resolved and unresolved
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listTickets", ticketService.getAllTickets());
        return "index";
    }

    @GetMapping("/showNewTicketForm")
    public String showNewTicketForm(Model model) {
        // create model attribute to bind form data
    	Ticket ticket = new Ticket();
        model.addAttribute("ticket", ticket);
        return "new_ticket";
    }

    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket) {
    	
        // save ticket to database
        ticketService.saveTicket(ticket);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String tid, Model model) {

        // get ticket from the service
    	Ticket ticket = ticketService.getTicketById(tid);

        // set ticket as a model attribute to pre-populate the form
        model.addAttribute("ticket", ticket);
        return "update_ticket";
    }

    @GetMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable(value = "id") String tid) {

        // call delete ticket method 
        this.ticketService.deleteTicketById(tid);
        return "redirect:/";
    }
}