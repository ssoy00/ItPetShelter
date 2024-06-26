package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Sno;

//    @ManyToOne
//    @JoinColumn(name = "Mno")
//    private Manager manager;

    private String sname;
    private String slocate;

}
