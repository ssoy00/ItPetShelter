package com.itpetshelter.itpetshelter.service;



import com.itpetshelter.itpetshelter.domain.Volunteer;
import com.itpetshelter.itpetshelter.dto.VolunteerDTO;
import com.itpetshelter.itpetshelter.repository.VolunteerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional

public class VolunteerServiceImpl implements VolunteerService {
//    @Autowired
//    private VolunteerRepository volunteerRepository;
//
//    @Override
//    public List<VolunteerDTO> getAllvolunteer() {
//
//        return volunteerRepository.findAll().stream()
//                .map(this::entityToDTO)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public VolunteerDTO entityToDTO(Volunteer volunteer) {
//        VolunteerDTO volunteerDTO = VolunteerDTO.builder()
//                .Vno(volunteer.getVno())
//                .Sno(volunteer.getShelter().getSno())
//                .Mno(volunteer.getManager().getMno())
//                .Cid(volunteer.getConsumer().getCid())
//                .VDate(volunteer.getVDate())
//                .VTime(volunteer.getVTime())
//                .build();
//
//        return volunteerDTO;
//    }

}