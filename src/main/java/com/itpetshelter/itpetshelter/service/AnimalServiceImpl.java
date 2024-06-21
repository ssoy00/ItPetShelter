//package com.itpetshelter.itpetshelter.service;
//
//import com.itpetshelter.itpetshelter.domain.Animal;
//import com.itpetshelter.itpetshelter.dto.AnimalDTO;
//import com.itpetshelter.itpetshelter.repository.AnimalRepository;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class AnimalServiceImpl implements AnimalService {
//
//    @Autowired
//    private AnimalRepository animalRepository;
//
//    @Autowired
//    private AnimalMapper animalMapper;
//
//    @Override
//    public List<AnimalDTO> getAllAnimals() {
//        return animalRepository.findAll().stream()
//                .map(animalMapper::toDTO)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public AnimalDTO getAnimalById(Long id) {
//        return animalRepository.findById(id)
//                .map(animalMapper::toDTO)
//                .orElseThrow(() -> new RuntimeException("Animal not found"));
//    }
//}
