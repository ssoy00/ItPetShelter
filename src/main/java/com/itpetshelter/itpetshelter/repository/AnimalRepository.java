package com.itpetshelter.itpetshelter.repository;

import com.itpetshelter.itpetshelter.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
