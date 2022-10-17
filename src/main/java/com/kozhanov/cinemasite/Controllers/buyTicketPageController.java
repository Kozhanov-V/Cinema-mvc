package com.kozhanov.cinemasite.Controllers;

import com.kozhanov.cinemasite.Models.Film;
import com.kozhanov.cinemasite.Models.Schedule;
import com.kozhanov.cinemasite.Models.Ticket;
import com.kozhanov.cinemasite.Repos.FilmRepo;
import com.kozhanov.cinemasite.Repos.ScheduleRepo;
import com.kozhanov.cinemasite.Repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

@Controller
public class buyTicketPageController {

    @Autowired
    FilmRepo filmRepo;

    @Autowired
    ScheduleRepo scheduleRepo;

    @Autowired
    TicketRepo ticketRepo;

    @GetMapping("/schedule/{id}")
    public String buyTicket(@PathVariable(value = "id")int id,Model model){
        Optional<Schedule> schedule = scheduleRepo.findById(id);
        ArrayList<Schedule> scheduleArrayList = new ArrayList<>();
        schedule.ifPresent(scheduleArrayList::add);

        Optional<Film> film =filmRepo.findById(scheduleArrayList.get(0).getIdFilm());
        ArrayList<Film> filmArrayList = new ArrayList<>();
        film.ifPresent(filmArrayList::add);

        Iterable<Ticket> allTickets= ticketRepo.findAll();
        ArrayList<Ticket> ticketArrayList = new ArrayList<>();
        allTickets.forEach(e->{
            if(e.getIdSchedule()==id)
            ticketArrayList.add(e);
        });
        model.addAttribute("tickets",ticketArrayList);
        model.addAttribute("film",filmArrayList);
        model.addAttribute("schedule",scheduleArrayList);
        return "html/buyTicketPage";
    }

}
