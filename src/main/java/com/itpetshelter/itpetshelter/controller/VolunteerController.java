package com.itpetshelter.itpetshelter.controller;


import com.itpetshelter.itpetshelter.dto.ShelterDTO;
import com.itpetshelter.itpetshelter.dto.VolunteerDTO;
import com.itpetshelter.itpetshelter.repository.VolunteerRepository;
import com.itpetshelter.itpetshelter.service.VolunteerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shelter")
@Log4j2
@RequiredArgsConstructor

public class VolunteerController {

    private final VolunteerService volunteerService;

//    @GetMapping("/volunteer")
//    public void volunteer(Model model) {
//        List<VolunteerDTO> volunteerlist = volunteerService.getAllvolunteer();
//        model.addAttribute("volunteerlist", volunteerlist);
//    }

}
