package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Volunteer")
@Entity
public class Volunteer extends BaseEntity{
    @Id
    private int Vno;

    @ManyToOne
    @JoinColumn(name = "Sno")
    private Shelter shelter;

    @ManyToOne
    @JoinColumn(name = "Mno")
    private Manager manager;

    @ManyToOne
    @JoinColumn(name = "Cid")
    private Consumer consumer;

    private LocalDateTime VDate;
    private LocalDateTime VTime;
}
