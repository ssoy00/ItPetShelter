package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Animal;
import com.itpetshelter.itpetshelter.domain.Board;
import com.itpetshelter.itpetshelter.domain.Type;
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


    @Override
    public Animal2DTO entityToDTO(Animal animal) {

        Animal2DTO animal2DTO = Animal2DTO.builder()
                .Ano(animal.getAno())
                .Atype(animal.getType().getAtype())
                .Aname(animal.getAname())
                .Aage(animal.getAage())
                .Agender(animal.getAgender())
                .Aneutered(animal.getAneutered())
                .Adisease(animal.getAdisease())
                .Alocate(animal.getShelter().getSlocate())
                .Alocatename(animal.getShelter().getSname())
                .build();

        List<String> imageFileNames = animal.getImageSet().stream()
                .map(image -> image.getAuuid() + "_" + image.getAfileName())
                .collect(Collectors.toList());

        animal2DTO.setImageFileNames(imageFileNames);

        return animal2DTO;

    }

    @Override
    public Animal dtoToEntity(Animal2DTO animal2DTO) {
        Animal animal = Animal.builder()
                .Ano(animal2DTO.getAno())
                .Atype(animal2DTO.getAtype())
                .Aname(animal2DTO.getAname())
                .Aage(animal2DTO.getAage())
                .Agender(animal2DTO.getAgender())
                .Adisease(animal2DTO.getAdisease())
                .Aneutered(animal2DTO.getAneutered())
                .shelter(animal2DTO.getAlocate())
                .shelter(animal2DTO.getAlocatename())
                .build();

        // 첨부 이미지들 추가
        if(animal2DTO.getImageFileNames() != null) {
            animal2DTO.getImageFileNames().forEach(fileName -> {
                String[] arr = fileName.split("_");
                animal.addImage(arr[0],arr[1]);
            });
        }
        return animal;
    }


    @Override
    public Long insert(Animal2DTO animal2DTO) {
        Animal animal = 
        return 0;
    }

}
