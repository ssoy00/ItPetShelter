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

public class Animal2DTO {

    private Long Ano;

    @NotEmpty
    private String Atype;

    @NotEmpty
    private String Aname;

    private String Acontent; //동물 설명글

    private Long Aage;

    private Boolean Agender;
    private Boolean Aneutered;
    private Boolean Adisease;

    @NotEmpty
    private String Alocate; //위치

    @NotEmpty
    private String Alocatename; //보호소이름


    //첨부 파일 이름들
    private List<String> ImageFileNames;
}
