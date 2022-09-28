package com.kozhanov.cinemasite.Repos;

import com.kozhanov.cinemasite.Models.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket,Integer> {
}
