package com.itpetshelter.itpetshelter.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class VolunteerDTO {
    private Long Vno;
    private Long Sno;
    private Long Mno;
    private String Cid;
    private LocalDateTime VDate;
    private LocalDateTime VTime;

}
