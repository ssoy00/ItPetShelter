package com.itpetshelter.itpetshelter.repository;

import com.itpetshelter.itpetshelter.domain.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepository extends JpaRepository<Shelter, Long> {


}
