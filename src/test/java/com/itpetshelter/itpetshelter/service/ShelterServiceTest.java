package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.domain.Shelter;
import com.itpetshelter.itpetshelter.dto.ShelterDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class ShelterServiceTest {

    @Autowired
    ShelterService shelterService;

    @Test
    public void test() {

        ShelterDTO shelterDTO = ShelterDTO.builder()
                .Sname("dd")
                .Mno(1L)
                .Sno(1L)
                .Slocate("ddddd")
                .build();
    }

}

