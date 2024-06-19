package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Reservation", indexes = {
        @Index(name = "idx_Reservation_Animal_Ano", columnList = "Animal_Ano")
})
@Entity

public class Reservation extends BaseEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Rno;

    @ManyToOne
    @JoinColumn(name = "Mno")
    private Manager manager;

    @ManyToOne
    @JoinColumn(name = "Ano")
    private Animal animal;

//    @OneToOne
//    @JoinColumn(name = "Uid")
//    private User user;

    @ManyToOne
    @JoinColumn(name = "Sno")
    private Shelter shelter;

    private LocalDateTime Date;
    private LocalDateTime Time;


    private Boolean Rcheck;

}

