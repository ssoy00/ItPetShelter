package com.itpetshelter.itpetshelter.Domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Type {
    @Id
    private int Tno;
    private String Atype;
}
