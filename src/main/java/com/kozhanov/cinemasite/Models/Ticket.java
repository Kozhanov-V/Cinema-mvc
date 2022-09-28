package com.kozhanov.cinemasite.Models;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ticket")
    private int idTicket;
    @Column(name = "id_schedule")
    private int idSchedule;
    @Column(name = "id_series_in_hall")
    private Integer idSeriesInHall;
    @Column(name = "place")
    private int place;
    @Column(name = "row")
    private int row;

    public void setIdSeriesInHall(Integer idSeriesInHall) {
        this.idSeriesInHall = idSeriesInHall;
    }

    public Ticket(){

    }
    public Ticket(int idTicket,int idSchedule,int place,int row){
        this.idTicket=idTicket;
        this.idSchedule=idSchedule;
        this.place=place;
        this.row = row;
    }
    public Ticket(int idSchedule,int place,int row){
        this.idSchedule=idSchedule;
        this.place=place;
        this.row = row;
    }
    public Ticket(int idTicket,int idSchedule,int place,int row,int idSeriesInHall){
        this.idTicket=idTicket;
        this.idSchedule=idSchedule;
        this.place=place;
        this.row = row;
        this.idSeriesInHall=idSeriesInHall;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public int getIdSeriesInHall() {
        return idSeriesInHall;
    }

    public void setIdSeriesInHall(int idSeriesInHall) {
        this.idSeriesInHall = idSeriesInHall;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }


}
