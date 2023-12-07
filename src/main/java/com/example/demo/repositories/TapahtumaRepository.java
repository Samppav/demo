package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Tapahtuma;


@Repository
public interface TapahtumaRepository extends JpaRepository<Tapahtuma, Long>{
    
}
