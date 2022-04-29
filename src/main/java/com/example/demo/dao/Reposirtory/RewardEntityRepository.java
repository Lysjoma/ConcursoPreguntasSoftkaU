package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.RewardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardEntityRepository extends JpaRepository<RewardEntity, Integer> {


}
