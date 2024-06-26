package com.itpetshelter.itpetshelter.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AnimalInsertDTO {

    private Long Ano;

    @NotEmpty
    private String Atype;

    @NotEmpty
    private String Aname;


    private Long Aage;
    private Boolean Agender;
    private Boolean Aneutered;
    private Boolean Adisease;

    @NotEmpty
    private String Alocate;

    @NotEmpty
    private String Alocatename;

    //동물 상세 내용
    private String AContent;

    //첨부 파일 이름들
    private List<String> fileNames;
}
