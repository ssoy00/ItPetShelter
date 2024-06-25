package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Shelter;
import com.itpetshelter.itpetshelter.dto.ShelterDTO;

import java.util.List;

public interface ShelterService {

    List<ShelterDTO> getAllshelters();
    ShelterDTO entityToDTO(Shelter shelter);
}
