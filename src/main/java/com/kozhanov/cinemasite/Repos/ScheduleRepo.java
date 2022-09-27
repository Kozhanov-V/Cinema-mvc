package com.kozhanov.cinemasite.Repos;


import com.kozhanov.cinemasite.Models.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepo extends CrudRepository<Schedule,Integer> {
}
