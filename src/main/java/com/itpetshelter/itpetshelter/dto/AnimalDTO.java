package com.itpetshelter.itpetshelter.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AnimalDTO {

    @NotEmpty
    private Integer Ano;

    @NotEmpty
    private String Atype;

    @NotEmpty
    private String Aname;

    @NotEmpty
    private Integer Aage;

    private Boolean Aneutered;
    private Boolean Adisease;

    @NotEmpty
    private String Alocate;
}
