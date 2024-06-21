package com.itpetshelter.itpetshelter.controller;

import com.itpetshelter.itpetshelter.dto.AnimalDTO;
import com.itpetshelter.itpetshelter.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public void getAllAnimals(Model model){
        List<AnimalDTO> animalList = animalService.getAllAnimals();
        model.addAttribute("animalList", animalList);
    }

    @GetMapping
    public void getAnimalById(Long id, Model model){
        AnimalDTO animalDTO = animalService.getAnimalById(id);
        model.addAttribute("animal", animalDTO);
    }
}