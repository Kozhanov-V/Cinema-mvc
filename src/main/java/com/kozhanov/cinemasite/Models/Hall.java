package com.kozhanov.cinemasite.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hall {

    @Id
    private int idHall;
    private int idTypeHall;

    public Hall() {

    }

    Hall(int idHall, int idTypeHall) {
        this.idHall = idHall;
        this.idTypeHall = idTypeHall;
    }

    public int getIdHall() {
        return idHall;
    }

    public void setIdHall(int idHall) {
        this.idHall = idHall;
    }

    public int getIdTypeHall() {
        return idTypeHall;
    }

    public void setIdTypeHall(int idTypeHall) {
        this.idTypeHall = idTypeHall;
    }
}
