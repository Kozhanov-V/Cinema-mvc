package com.kozhanov.cinemasite.Models;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFilm;
    @Column(name = "tittle")
    private String title;
    private int duration;
    private Date startDate;
    private Date stopDate;
    private String genre;
    private String country;
    @Column(name = "url_on_poster")
    private String urlOnPoster;

    public String getUrlOnPoster() {
        return urlOnPoster;
    }

    public void setUrlOnPoster(String urlOnPoster) {
        this.urlOnPoster = urlOnPoster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }
}
