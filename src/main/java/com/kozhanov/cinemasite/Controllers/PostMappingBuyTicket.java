package com.kozhanov.cinemasite.Controllers;

import com.kozhanov.cinemasite.Models.Ticket;
import com.kozhanov.cinemasite.Repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostMappingBuyTicket {

    @Autowired
    TicketRepo ticketRepo;

    @RequestMapping(value="/schedule/{id}", method= RequestMethod.POST)
    public String ticketUpdate(@PathVariable(value = "id")int id, @RequestParam ArrayList<Integer> tickets){
        for (int item:tickets ) {
            int row =0;
            int ticketsForWhile = item;
            while (ticketsForWhile-14>0){
                row++;
                ticketsForWhile-=14;
            }

            ticketRepo.save(new Ticket(27,1,1));
        }
        return "html/mainPage";
    }
}
