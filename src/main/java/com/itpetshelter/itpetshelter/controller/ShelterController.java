package com.itpetshelter.itpetshelter.controller;

import com.itpetshelter.itpetshelter.dto.ShelterDTO;
import com.itpetshelter.itpetshelter.service.ShelterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/page")
@Log4j2
@RequiredArgsConstructor

public class ShelterController {

    private final ShelterService shelterService;

    @GetMapping("/shelter")
    public void shelter(Model model) {
        List<ShelterDTO> snamelist = shelterService.getAllshelters();
        log.info("ShelterController snamelist :"+snamelist);
        model.addAttribute("snamelist", snamelist);
    }



}
