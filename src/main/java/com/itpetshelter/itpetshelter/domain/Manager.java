package com.itpetshelter.itpetshelter.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Manager {
    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String Mid;

    @ManyToOne
    @JoinColumn(name = "Sno")
    private Shelter shelter;
    private String Mpw;
    private String Mname;

    // 멤버를 조회시 roleSet 를 같이 조회를 하기.
    @ElementCollection(fetch = FetchType.LAZY)
    @Builder.Default
    private Set<MemberRole> roleSet = new HashSet<>();

    public void addRole(MemberRole memberRole) {
        this.roleSet.add(memberRole);

    }


}

