package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Position;

public interface PositionRepository extends JpaRepository<Position,Integer>{

}
