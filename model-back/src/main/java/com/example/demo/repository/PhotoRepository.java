package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Photo;

public interface PhotoRepository extends JpaRepository<Photo,Integer>{

}
