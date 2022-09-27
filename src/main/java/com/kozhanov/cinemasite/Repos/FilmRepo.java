package com.kozhanov.cinemasite.Repos;

import com.kozhanov.cinemasite.Models.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepo extends CrudRepository<Film,Integer> {
}
