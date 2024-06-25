package com.itpetshelter.itpetshelter.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/volunteer")
@Log4j2
@RequiredArgsConstructor

public class VolunteerController {

    //글쓰기 폼
    @GetMapping("/itpetshelter/volunteer")
    public void registerForm() {
    }

}
