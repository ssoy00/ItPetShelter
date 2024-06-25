package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Board;
import com.itpetshelter.itpetshelter.domain.Reservation;
import com.itpetshelter.itpetshelter.dto.BoardDTO;
import com.itpetshelter.itpetshelter.dto.ReservationDTO;

public interface ReservationService {
    void saveReservation(Reservation reservation);

    ReservationDTO read(Long rno);

    default Reservation dtoToEntity(ReservationDTO reservationDTO) {

        Reservation reservation = Reservation.builder()
                .Rno(reservationDTO.getRno())
                .RDate(reservationDTO.getRdate())
                .RTime(reservationDTO.getRtime())
                .build();

        return reservation;
    }
}