package com.validation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validation.entity.Amajon;

@Repository
public interface AmajonRepo extends JpaRepository<Amajon, Integer> {

}
