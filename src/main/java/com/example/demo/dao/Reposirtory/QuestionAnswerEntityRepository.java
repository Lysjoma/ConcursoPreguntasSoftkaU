package com.example.demo.dao.Reposirtory;


import com.example.demo.dao.Entities.QuestionanswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionAnswerEntityRepository extends JpaRepository<QuestionanswerEntity, Integer> {


}
