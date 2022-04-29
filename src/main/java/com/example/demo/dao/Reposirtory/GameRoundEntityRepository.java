package com.example.demo.dao.Reposirtory;


import com.example.demo.dao.Entities.GameroundEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRoundEntityRepository extends JpaRepository<GameroundEntity, Integer> {


}
