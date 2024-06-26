package com.itpetshelter.itpetshelter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShelterDTO {

    private Long Sno;
    private Long Mno;
    private String Sname;
    private String Slocate;

}
