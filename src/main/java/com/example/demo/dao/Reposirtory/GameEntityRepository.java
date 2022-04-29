package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameEntityRepository extends JpaRepository<GameEntity, Integer> {


}
