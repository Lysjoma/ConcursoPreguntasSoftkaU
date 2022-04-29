package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.RoundEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundEntityRepository extends JpaRepository<RoundEntity, Integer> {


}
