package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "animal") //animal 제외.. why? 질문!
@Table(name = "AnimalImage")
@Entity
public class AnimalImage implements Comparable<AnimalImage>{

    @Id
    private String Auuid;

    private String AfileName;
    private int ord; //사진 올린 순번

    private String AContent; //동물 소개 설명글

    @ManyToOne
    private Animal animal;

    @Override
    public int compareTo(AnimalImage other) {
        return this.ord - other.ord; //음수 내림차순, 양수 오름차순
    }

    // 영속성을 이용해서, 부모 객체를 참고 있다가 , 만약, 부모 객체가 없어진다면,
    // 고아 객체가 되어서, 자동 삭제 이용할 예정.
    public void changeAnimal(Animal animal) {
        this.animal = animal;
    }

}
