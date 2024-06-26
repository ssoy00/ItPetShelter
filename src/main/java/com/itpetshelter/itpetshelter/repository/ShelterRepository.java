package com.itpetshelter.itpetshelter.repository;


import com.itpetshelter.itpetshelter.domain.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShelterRepository extends JpaRepository<Shelter, Integer> {
    Optional<Shelter> findBySnameAndSlocate(String Sname, String Slocate);
}
