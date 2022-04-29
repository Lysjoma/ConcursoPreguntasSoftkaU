package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerEntityRepository extends JpaRepository<PlayerEntity, Integer> {


}
