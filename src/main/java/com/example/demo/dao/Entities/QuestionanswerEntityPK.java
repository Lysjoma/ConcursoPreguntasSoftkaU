package com.example.demo.dao.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class QuestionanswerEntityPK implements Serializable {
    @Column(name = "id_question")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuestion;
    @Column(name = "id_answer")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnswer;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionanswerEntityPK that = (QuestionanswerEntityPK) o;
        return idQuestion == that.idQuestion && idAnswer == that.idAnswer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, idAnswer);
    }
}
