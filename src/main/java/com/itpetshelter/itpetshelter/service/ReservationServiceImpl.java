package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Reservation;
import com.itpetshelter.itpetshelter.dto.ReservationDTO;
import com.itpetshelter.itpetshelter.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class ReservationServiceImpl implements ReservationService{


    private final ReservationRepository reservationRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveReservation(Reservation reservation) {
        log.info("Saving reservation: {}", reservation);
        reservationRepository.save(reservation);
    }

    @Override
    public ReservationDTO read(Long rno) {
        log.info("Reading reservation with rno: {}", rno);
        Optional<Reservation> result = reservationRepository.findById(rno);
        Reservation reservation = result.orElseThrow();
        ReservationDTO reservationDTO = modelMapper.map(reservation, ReservationDTO.class);

        return reservationDTO;
    }

}
