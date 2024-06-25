package com.itpetshelter.itpetshelter.controller;

import com.itpetshelter.itpetshelter.domain.Animal;
import com.itpetshelter.itpetshelter.domain.Reservation;
import com.itpetshelter.itpetshelter.domain.Shelter;
import com.itpetshelter.itpetshelter.dto.AnimalDTO;
import com.itpetshelter.itpetshelter.dto.ReservationDTO;
import com.itpetshelter.itpetshelter.repository.AnimalRepository;
import com.itpetshelter.itpetshelter.repository.ReservationRepository;
import com.itpetshelter.itpetshelter.repository.ShelterRepository;
import com.itpetshelter.itpetshelter.service.AnimalService;
import com.itpetshelter.itpetshelter.service.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/itpetshelter")
@Log4j2
@RequiredArgsConstructor
public class IPSController {

    private final AnimalRepository animalRepository;
    private final ShelterRepository shelterRepository;
    private final ReservationService reservationService;

    @GetMapping("/index")
    public void index() {
    }

    @GetMapping("/reservation")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("animals", animalRepository.findAll());
        model.addAttribute("shelters", shelterRepository.findAll());
        return "itpetshelter/reservation";
    }

    @PostMapping("/reservation")
    public String submitReservation(@ModelAttribute("reservation") Reservation reservation, RedirectAttributes redirectAttributes) {
        if (reservation.getAnimal() == null) {
            reservation.setAnimal(new Animal());
        }
        if (reservation.getShelter() == null) {
            reservation.setShelter(new Shelter());
        }

        reservationService.saveReservation(reservation);

        redirectAttributes.addAttribute("RDate", reservation.getRDate());
        redirectAttributes.addAttribute("RTime", reservation.getRTime());
        redirectAttributes.addAttribute("ano", reservation.getAnimal().getAno());
        redirectAttributes.addAttribute("sno", reservation.getShelter().getSno());
        return "redirect:/itpetshelter/reservation_success";
    }

    @GetMapping("/reservation_success")
    public String showReservationSuccess(@RequestParam("RDate") String RDate,
                                         @RequestParam("RTime") String RTime,
                                         @RequestParam("ano") Long ano,
                                         @RequestParam("sno") Long sno, Model model) {
        Reservation reservation = new Reservation();
        reservation.setRDate(LocalDateTime.parse(RDate));
        reservation.setRTime(LocalDateTime.parse(RTime));
        reservation.setAnimal(animalRepository.findById(ano).orElse(null));
        reservation.setShelter(shelterRepository.findById(Math.toIntExact(sno)).orElse(null));
        model.addAttribute("reservation", reservation);
        return "itpetshelter/reservation_success";
    }

    @GetMapping("/shelter")
    public String shelter() {
        return "page/shelter";
    }

    @GetMapping("/volunteer")
    public String volunteer() {
        return "page/volunteer";
    }


}
