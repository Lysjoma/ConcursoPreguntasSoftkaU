package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.AnswersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersEntityRepository extends JpaRepository<AnswersEntity, Integer> {


}
