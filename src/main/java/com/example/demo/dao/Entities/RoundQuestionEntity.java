package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "round-question", schema = "questions", catalog = "")
@IdClass(RoundQuestionEntityPK.class)
public class RoundQuestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_round")
    private int idRound;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_question")
    private int idQuestion;
    @ManyToOne
    @JoinColumn(name = "id_round", referencedColumnName = "id_round", nullable = false, insertable=false, updatable=false)
    private RoundEntity roundByIdRound;
    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id_question", nullable = false, insertable=false, updatable=false)
    private QuestionsEntity questionsByIdQuestion;

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
        RoundQuestionEntity that = (RoundQuestionEntity) o;
        return idRound == that.idRound && idQuestion == that.idQuestion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRound, idQuestion);
    }

    public RoundEntity getRoundByIdRound() {
        return roundByIdRound;
    }

    public void setRoundByIdRound(RoundEntity roundByIdRound) {
        this.roundByIdRound = roundByIdRound;
    }

    public QuestionsEntity getQuestionsByIdQuestion() {
        return questionsByIdQuestion;
    }

    public void setQuestionsByIdQuestion(QuestionsEntity questionsByIdQuestion) {
        this.questionsByIdQuestion = questionsByIdQuestion;
    }
}
