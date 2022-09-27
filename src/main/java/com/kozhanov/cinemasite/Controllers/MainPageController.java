package com.kozhanov.cinemasite.Controllers;

import com.kozhanov.cinemasite.Models.Film;
import com.kozhanov.cinemasite.Models.Schedule;
import com.kozhanov.cinemasite.Models.ScheduleForOut;
import com.kozhanov.cinemasite.Models.ScheduleId;
import com.kozhanov.cinemasite.Repos.FilmRepo;
import com.kozhanov.cinemasite.Repos.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainPageController {

    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private ScheduleRepo scheduleRepo;
    @GetMapping("/")
    public String mainPageController(Model model){
        Iterable<Schedule> schedules = scheduleRepo.findAll();
        List<ScheduleForOut> scheduleFirstDay =new ArrayList<>();
        List<ScheduleForOut> scheduleSecondDay = new ArrayList<>();
        List<ScheduleForOut> scheduleThridDay = new ArrayList<>();
        List<ScheduleForOut> scheduleFourthDay = new ArrayList<>();
        List<ScheduleForOut> scheduleFifthDay = new ArrayList<>();
        LocalDate nowDate = LocalDate.now();
        for (Schedule item:schedules) {

            Optional<Film> film = filmRepo.findById(item.getIdFilm());
            LocalDate newLocalDate = item.getStartTime().toLocalDateTime().toLocalDate();

            if(nowDate.getDayOfMonth()== newLocalDate.getDayOfMonth()&& nowDate.getMonthValue()==newLocalDate.getMonthValue() && nowDate.getYear()==newLocalDate.getYear()) {
                boolean checker =true;
                for (ScheduleForOut scheduleForOut:scheduleFirstDay) {
                    if(scheduleForOut.getTitleFilm().equals(film.get().getTitle())){
                        scheduleForOut.getStartTime().add(new ScheduleId(new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours()-4) * 3600000).toString().substring(0,5),item.getIdSchedule()));
                        checker=false;
                    }
                }
                if(checker){
                    ScheduleForOut newScheduleForOut = null;
                    if(film.get().getUrlOnPoster()==null) {
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getGenre(),film.get().getCountry());
                    }
                    else{
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getUrlOnPoster(),film.get().getGenre(),film.get().getCountry());
                    }
                    scheduleFirstDay.add(newScheduleForOut);
                }
            }
            if(nowDate.getDayOfMonth()+1== newLocalDate.getDayOfMonth()&& nowDate.getMonthValue()==newLocalDate.getMonthValue() && nowDate.getYear()==newLocalDate.getYear()) {
                boolean checker =true;
                for (ScheduleForOut scheduleForOut:scheduleSecondDay) {
                    if(scheduleForOut.getTitleFilm().equals(film.get().getTitle())){
                        scheduleForOut.getStartTime().add(new ScheduleId(new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours()-4) * 3600000).toString().substring(0,5),item.getIdSchedule()));
                        checker=false;
                    }
                }
                if(checker){
                    ScheduleForOut newScheduleForOut = null;
                    if(film.get().getUrlOnPoster()==null) {
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getGenre(),film.get().getCountry());
                    }
                    else{
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getUrlOnPoster(),film.get().getGenre(),film.get().getCountry());
                    }
                    scheduleSecondDay.add(newScheduleForOut);
                }
            }
            if(nowDate.getDayOfMonth()+2== newLocalDate.getDayOfMonth()&& nowDate.getMonthValue()==newLocalDate.getMonthValue() && nowDate.getYear()==newLocalDate.getYear()) {
                boolean checker =true;
                for (ScheduleForOut scheduleForOut:scheduleThridDay) {
                    if(scheduleForOut.getTitleFilm().equals(film.get().getTitle())){
                        scheduleForOut.getStartTime().add(new ScheduleId(new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours()-4) * 3600000).toString().substring(0,5),item.getIdSchedule()));
                        checker=false;
                    }
                }
                if(checker){
                    ScheduleForOut newScheduleForOut = null;
                    if(film.get().getUrlOnPoster()==null) {
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getGenre(),film.get().getCountry());
                    }
                    else{
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getUrlOnPoster(),film.get().getGenre(),film.get().getCountry());
                    }
                    scheduleThridDay.add(newScheduleForOut);
                }
            }
            if(nowDate.getDayOfMonth()+3== newLocalDate.getDayOfMonth()&& nowDate.getMonthValue()==newLocalDate.getMonthValue() && nowDate.getYear()==newLocalDate.getYear()) {
                boolean checker =true;
                for (ScheduleForOut scheduleForOut:scheduleFourthDay) {
                    if(scheduleForOut.getTitleFilm().equals(film.get().getTitle())){
                        scheduleForOut.getStartTime().add(new ScheduleId(new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours()-4) * 3600000).toString().substring(0,5),item.getIdSchedule()));
                        checker=false;
                    }
                }
                if(checker){
                    ScheduleForOut newScheduleForOut = null;
                    if(film.get().getUrlOnPoster()==null) {
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getGenre(),film.get().getCountry());
                    }
                    else{
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getUrlOnPoster(),film.get().getGenre(),film.get().getCountry());
                    }
                    scheduleFourthDay.add(newScheduleForOut);
                }
            }
            if(nowDate.getDayOfMonth()+4== newLocalDate.getDayOfMonth()&& nowDate.getMonthValue()==newLocalDate.getMonthValue() && nowDate.getYear()==newLocalDate.getYear()) {
                boolean checker =true;
                for (ScheduleForOut scheduleForOut:scheduleFifthDay) {
                    if(scheduleForOut.getTitleFilm().equals(film.get().getTitle())){
                        scheduleForOut.getStartTime().add(new ScheduleId(new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours()-4) * 3600000).toString().substring(0,5),item.getIdSchedule()));
                        checker=false;
                    }
                }
                if(checker){
                    ScheduleForOut newScheduleForOut = null;
                    if(film.get().getUrlOnPoster()==null) {
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getGenre(),film.get().getCountry());
                    }
                    else{
                        newScheduleForOut = new ScheduleForOut(item.getIdSchedule(), film.get().getTitle(), item.getIdHall(), new Time(item.getStartTime().getMinutes() * 60000 + (item.getStartTime().getHours() - 4) * 3600000),film.get().getUrlOnPoster(),film.get().getGenre(),film.get().getCountry());
                    }
                    scheduleFifthDay.add(newScheduleForOut);
                }
            }

        }

      //  Iterable<Film> films = filmRepo.findAll();
        //  model.addAttribute("nowDate",nowDate.getDayOfMonth());
        List<String> dates = new ArrayList<>();
        for (int i =0;i<5;i++){
            if(nowDate.getMonthValue()<10)
            dates.add(String.valueOf(nowDate.getDayOfMonth()+i) +"."+ "0"+nowDate.getMonthValue());
            else{
                dates.add(String.valueOf(nowDate.getDayOfMonth()+i) +"."+nowDate.getMonthValue());
            }
        }
        model.addAttribute("dates",dates);
        model.addAttribute("scheduleFourthDay",scheduleFourthDay);
        model.addAttribute("scheduleFifthDay",scheduleFifthDay);
        model.addAttribute("scheduleThridDay",scheduleThridDay);
        model.addAttribute("scheduleFirstDay",scheduleFirstDay);
        model.addAttribute("scheduleSecondDay",scheduleSecondDay);
        return "html/mainPage";
    }


}
