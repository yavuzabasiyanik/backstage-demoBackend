package com.example.backstageDemo.backstageDemo.Repositories;

import com.example.backstageDemo.backstageDemo.Entities.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity,Long> {
}
