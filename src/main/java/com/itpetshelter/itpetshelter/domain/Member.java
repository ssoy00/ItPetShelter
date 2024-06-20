package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Member {
    @Id
    private String Mid;
    private String Mpw;
    private String Mname;
    private String Mphone;
}