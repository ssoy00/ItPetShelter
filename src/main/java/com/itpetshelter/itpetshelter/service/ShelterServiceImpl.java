package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Animal;
import com.itpetshelter.itpetshelter.domain.Shelter;
import com.itpetshelter.itpetshelter.dto.AnimalDTO;
import com.itpetshelter.itpetshelter.dto.BoardDTO;
import com.itpetshelter.itpetshelter.dto.ShelterDTO;
import com.itpetshelter.itpetshelter.repository.ShelterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShelterServiceImpl implements ShelterService{

    @Autowired
    private ShelterRepository shelterRepository;

    @Override
    public List<ShelterDTO> getAllshelters() {

         return shelterRepository.findAll().stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ShelterDTO entityToDTO(Shelter shelter) {
        ShelterDTO shelterDTO = ShelterDTO.builder()
                .Slocate(shelter.getSlocate())
                .Sno(shelter.getSno())
                .Mno(shelter.getManager().getMno())
                .Sname(shelter.getSname())
                .build();

        return shelterDTO;
    }
}
