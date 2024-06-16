package com.itpetshelter.itpetshelter.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private String Uid;
    private String Upw;
    private String Uname;
    private String Uphone;
}
