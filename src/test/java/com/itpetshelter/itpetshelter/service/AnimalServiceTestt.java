package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.dto.Animal2DTO;
import com.itpetshelter.itpetshelter.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class AnimalServiceTestt {

    @Autowired
    AnimalService22 animalService;


    @Test
    public void testRead() {

        Animal2DTO animal2DTO = animalService.read(1L);
        log.info("하나 조회 boardDTO : " + animal2DTO);

    }


}

