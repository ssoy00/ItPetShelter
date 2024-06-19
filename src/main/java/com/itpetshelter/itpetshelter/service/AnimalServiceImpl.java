//package com.itpetshelter.itpetshelter.service;
//
//import com.itpetshelter.itpetshelter.domain.Animal;
//import com.itpetshelter.itpetshelter.dto.AnimalDTO;
//import com.itpetshelter.itpetshelter.repository.AnimalRepository;
//import org.modelmapper.ModelMapper;
//
//public class AnimalServiceImpl implements AnimalService {
//
//    //의존성 주입
//    private final AnimalRepository animalRepository;
//    private final ModelMapper modelMapper;
//
//    @Override
//    public Long register(AnimalDTO animalDTO) {
//        Animal animal = modelMapper.map(animalDTO, Animal.class);
//
//        return 0;
//    }
//}
