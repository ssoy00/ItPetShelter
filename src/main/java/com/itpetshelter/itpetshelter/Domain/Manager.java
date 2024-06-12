package com.itpetshelter.itpetshelter.Domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Manager {
    @Id
    private int Mno;
    private String Mpw;
    private String Mname;
    private String Mid;
}

