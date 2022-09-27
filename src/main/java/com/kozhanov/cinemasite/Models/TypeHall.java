package com.kozhanov.cinemasite.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TypeHall {

    @Id
    private int idTypeHall;
    private String nameHall;

    public TypeHall(){

    }
    public TypeHall(int idTypeHall,String nameHall){
        this.idTypeHall=idTypeHall;
        this.nameHall=nameHall;
    }
    public int getIdTypeHall() {
        return idTypeHall;
    }

    public void setIdTypeHall(int idTypeHall) {
        this.idTypeHall = idTypeHall;
    }

    public String getNameHall() {
        return nameHall;
    }

    public void setNameHall(String nameHall) {
        this.nameHall = nameHall;
    }
}
