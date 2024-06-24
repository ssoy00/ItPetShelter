package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Animal;
import com.itpetshelter.itpetshelter.dto.Animal2DTO;
import com.itpetshelter.itpetshelter.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl22 implements AnimalService22 {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal2DTO> getAllAnimals() {
        return animalRepository.findAll().stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Animal2DTO read(Long ano) {
        return animalRepository.findById(ano)
                .map(this::entityToDTO)
                .orElseThrow(() -> new RuntimeException("Animal not found"));
    }

//    @Override
//    public Animal2DTO getAnimalById(Long id) {
//        return animalRepository.findById(id)
//                .map(this::entityToDTO)
//                .orElseThrow(() -> new RuntimeException("Animal not found"));
//    }

    @Override
    public Animal2DTO entityToDTO(Animal animal) {

        return Animal2DTO.builder()
                .Ano(animal.getAno())
                .Atype(animal.getType().getAtype())
                .Aname(animal.getAname())
                .Aage(animal.getAage())
                .Aneutered(animal.getAneutered())
                .Adisease(animal.getAdisease())
                .Alocate(animal.getShelter().getSlocate())
                .Alocatename(animal.getShelter().getSname())
                .build();
    }

    @Override
    public List<Animal2DTO> searchAnimals(String keyword) {
        List<Animal> animals = animalRepository.findByTypeKeyword(keyword);
        return animals.stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }
}


