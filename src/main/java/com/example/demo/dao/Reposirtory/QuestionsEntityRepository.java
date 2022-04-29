package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.QuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsEntityRepository extends JpaRepository<QuestionsEntity, Integer> {


}
