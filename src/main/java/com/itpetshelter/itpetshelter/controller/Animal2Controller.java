package com.itpetshelter.itpetshelter.controller;

import com.itpetshelter.itpetshelter.dto.Animal2DTO;
import com.itpetshelter.itpetshelter.service.AnimalService22;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/itpetshelter")
@Log4j2
@RequiredArgsConstructor
public class Animal2Controller {
    @Autowired
    private AnimalService22 animalService;

    @GetMapping("/animalList22")
    public String getAllAnimals(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<Animal2DTO> animalList2;
        if (keyword != null && !keyword.isEmpty()) {
            animalList2 = animalService.searchAnimals(keyword);
        } else {
            animalList2 = animalService.getAllAnimals();
        }
        model.addAttribute("animalList2", animalList2);
        return "itpetshelter/animalList22";
    }

    @GetMapping("/animalDetail")
    public String read(Long ano, Model model){
        Animal2DTO animalDTO = animalService.read(ano);

        model.addAttribute("animal2DTO", animalDTO);
        return "itpetshelter/animalDetail";
    }
}