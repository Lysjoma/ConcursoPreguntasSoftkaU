package com.example.demo.dao.Reposirtory;

import com.example.demo.dao.Entities.RoundQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundQuestionEntityRepository extends JpaRepository<RoundQuestionEntity, Integer> {


}
