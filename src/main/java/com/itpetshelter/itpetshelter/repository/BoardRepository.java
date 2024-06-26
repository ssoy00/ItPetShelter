package com.itpetshelter.itpetshelter.repository;


import com.itpetshelter.itpetshelter.domain.Board;
import com.itpetshelter.itpetshelter.repository.search.BoardSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface BoardRepository extends JpaRepository<Board,Long> , BoardSearch {

  Page<Board> findByTitleContainingOrderByBnoDesc(String title, String keyword, Pageable pageable);


  @Query("select  b from Board b where b.title  like concat('%',:keyword ,'%')")
  Page<Board> findByKeyword(String keyword, Pageable pageable);




  @Query(value = "select now()", nativeQuery = true)
  String getTime();


  @EntityGraph(attributePaths = {"imageSet"})
  @Query("select b from Board b where b.bno=:bno")
  Optional<Board> findByIdWithImages(Long bno);


}













