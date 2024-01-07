package com.gfa.springplussql.repository;

import com.gfa.springplussql.model.Fox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoxRepository extends JpaRepository<Fox, Long> {
    List<Fox> findFoxByNameContainsIgnoreCase(String s);

    @Query("SELECT f FROM Fox f WHERE f.color = 'Red'")
        //JPQL
    List<Fox> findAllRedFoxes();

    @Query(value = "SELECT * FROM foxes WHERE color = 'Red'", nativeQuery = true)
        //Native
    List<Fox> findAllRedFoxesNative();
}
