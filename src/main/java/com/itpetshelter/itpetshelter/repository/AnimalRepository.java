package com.itpetshelter.itpetshelter.repository;

import com.itpetshelter.itpetshelter.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//JpaRepository<엔터티클래스명(T), PK 타입(ID)> 은 기본적인 쿼리 메소드 만들어줌 CRUD
// 레포지토리 어노테이션 추가
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
//    @Query("select a from Animal where a.") 쿼리문 자동으로 만들어줌..
    @Query("SELECT a FROM Animal a WHERE a.type.type LIKE %:keyword%")
    List<Animal> findByTypeKeyword(@Param("keyword") String Keyword);

//    Optional<Animal> findByAname(String Aname);
@Query("select m from Animal m where m.Aname = :Aname")
    Optional<Animal> findByAname(String Aname);




}