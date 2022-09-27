package com.kozhanov.cinemasite.Models;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ScheduleForOut {

    private int idSchedule;
    private String titleFilm;
    private int idHall;
    private List<ScheduleId> startTime = new ArrayList<>();
    private String genre;
    private String country;
    private String urlOnPoster;

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

    public ScheduleForOut(){

    }

    public String getUrlOnPoster() {
        return urlOnPoster;
    }

    public void setUrlOnPoster(String urlOnPoster) {
        this.urlOnPoster = urlOnPoster;
    }

    public ScheduleForOut(int idSchedule, String titleFilm, int idHall, Time startTime, String urlOnPoster){
        this.idSchedule =idSchedule;
        this.titleFilm=titleFilm;
        this.idHall=idHall;
        this.startTime.add(new ScheduleId(startTime.toString().substring(0,5),idSchedule));
        this.urlOnPoster =urlOnPoster;
    }
    public ScheduleForOut(int idSchedule, String titleFilm, int idHall, Time startTime){
        this.idSchedule =idSchedule;
        this.titleFilm=titleFilm;
        this.idHall=idHall;
        this.startTime.add(new ScheduleId(startTime.toString().substring(0,5),idSchedule));
        this.urlOnPoster ="https://77kino.ucoz.ru/_pu/18/97744639.jpg";
    }
    public ScheduleForOut(int idSchedule, String titleFilm, int idHall, Time startTime,String genre,String country){
        this.idSchedule =idSchedule;
        this.titleFilm=titleFilm;
        this.idHall=idHall;
        this.startTime.add(new ScheduleId(startTime.toString().substring(0,5),idSchedule));
        this.urlOnPoster ="https://77kino.ucoz.ru/_pu/18/97744639.jpg";
        this.genre=genre;
        this.country=country;
    }
    public ScheduleForOut(int idSchedule, String titleFilm, int idHall, Time startTime, String urlOnPoster,String genre,String country){
        this.idSchedule =idSchedule;
        this.titleFilm=titleFilm;
        this.idHall=idHall;
        this.startTime.add(new ScheduleId(startTime.toString().substring(0,5),idSchedule));
        this.urlOnPoster =urlOnPoster;
        this.genre=genre;
        this.country=country;
    }
    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public int getIdHall() {
        return idHall;
    }

    public void setIdHall(int idHall) {
        this.idHall = idHall;
    }

    public List<ScheduleId> getStartTime() {
        return startTime;
    }

    public void setStartTime(List<ScheduleId> startTime) {
        this.startTime = startTime;
    }
}
