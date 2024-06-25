package com.itpetshelter.itpetshelter.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ReservationDTO {

    private Long rno;

    private Long mno;

    private Long ano;

    private Long cno;

    private Long sno;

    private LocalDateTime rdate;
    private LocalDateTime rtime;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
