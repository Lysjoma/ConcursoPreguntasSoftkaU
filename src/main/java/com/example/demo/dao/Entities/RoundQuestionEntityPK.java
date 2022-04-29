package com.example.demo.dao.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RoundQuestionEntityPK implements Serializable {
    @Column(name = "id_round")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRound;
    @Column(name = "id_question")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuestion;

    public int getIdRound() {
        return idRound;
    }

    public void setIdRound(int idRound) {
        this.idRound = idRound;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoundQuestionEntityPK that = (RoundQuestionEntityPK) o;
        return idRound == that.idRound && idQuestion == that.idQuestion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRound, idQuestion);
    }
}
