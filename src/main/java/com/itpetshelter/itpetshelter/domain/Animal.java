package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.ToOne;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Animal")
//, indexes = {
//        @Index(name = "idx_Animal_Type_Tno", columnList = "Type_Tno")
//})
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Ano;

    @ManyToOne
    @JoinColumn(name = "Tno")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "Sno")
    private Shelter shelter;

//    @ManyToOne
//    @JoinColumn(name = "Mno")
//    private Manager manager;

    private String Aname;
    private Long Aage;
    private Boolean Aneutered;  //중성화
    private Boolean Adisease;  //질병
}
