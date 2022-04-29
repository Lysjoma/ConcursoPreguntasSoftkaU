package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.GamehistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameHistoryEntityRepository extends JpaRepository<GamehistoryEntity, Integer> {


}
