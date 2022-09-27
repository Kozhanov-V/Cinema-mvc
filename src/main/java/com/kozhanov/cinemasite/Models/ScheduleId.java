package com.kozhanov.cinemasite.Models;

import java.sql.Time;

public class ScheduleId {
    private String startTime;
    private int idSchedule;
   public ScheduleId(){

    }
    public ScheduleId(String startTime,int idSchedule){
        this.startTime=startTime;
        this.idSchedule=idSchedule;
    }
    public ScheduleId(Time startTime,int idSchedule){
        this.startTime=startTime.toString().substring(0,5);
        this.idSchedule=idSchedule;
    }
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }
}
