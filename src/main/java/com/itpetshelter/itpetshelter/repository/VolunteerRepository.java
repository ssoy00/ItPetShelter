package com.itpetshelter.itpetshelter.repository;

import com.itpetshelter.itpetshelter.domain.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer,Long> {

}
