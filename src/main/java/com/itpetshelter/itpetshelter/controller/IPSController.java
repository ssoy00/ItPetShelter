package com.itpetshelter.itpetshelter.controller;

import com.itpetshelter.itpetshelter.domain.Reservation;
import com.itpetshelter.itpetshelter.repository.AnimalRepository;
import com.itpetshelter.itpetshelter.repository.ReservationRepository;
import com.itpetshelter.itpetshelter.repository.ShelterRepository;
import com.itpetshelter.itpetshelter.service.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itpetshelter")
@Log4j2
@RequiredArgsConstructor
public class IPSController {

    @Autowired
    private ReservationRepository reservationRepository;

    private final AnimalRepository animalRepository;

    private final ShelterRepository shelterRepository;

    private ReservationService reservationService;

    @GetMapping("/index")
    public void index() {
    }

    @GetMapping("/reservation")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("animals", animalRepository.findAll());
        model.addAttribute("shelters", shelterRepository.findAll());
        return "reservation";
    }

    @PostMapping("/reservation_success")
    public String createReservation(@ModelAttribute("reservation") Reservation reservation) {
        // 예약 정보를 DB에 저장하는 로직
        reservationService.saveReservation(reservation);
        return "reservation_success";
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
