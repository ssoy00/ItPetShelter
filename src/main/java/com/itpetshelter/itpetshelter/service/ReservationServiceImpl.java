package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Reservation;
import com.itpetshelter.itpetshelter.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
