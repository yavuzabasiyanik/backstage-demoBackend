package com.example.backstageDemo.backstageDemo.Repositories;

import com.example.backstageDemo.backstageDemo.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
